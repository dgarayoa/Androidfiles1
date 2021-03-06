package edu.uoc.expensemanager.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.uoc.expensemanager.R;
import edu.uoc.expensemanager.Utilities.DownLoadImageTask;
import edu.uoc.expensemanager.model.UserInfo;


public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.ViewHolder>{
    private ArrayList<UserInfo> listdata;
    private Context activityContext;
    // RecyclerView recyclerView;
    public UserListAdapter(ArrayList<UserInfo> listdata, Context context) {
        this.listdata = listdata;
        this.activityContext = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item_user, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final UserInfo myListData = listdata.get(position);

        holder.userEmail.setText(myListData.email);
        if (listdata.get(position).url_avatar!= null && listdata.get(position).url_avatar.compareTo("") == 0){
            holder.userAvatar.setImageResource(R.drawable.user_avatar);
        }else{
            new DownLoadImageTask(holder.userAvatar).execute(listdata.get(position).url_avatar);
        }
        //holder.imageView.setImageResource(listdata[position].());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(view.getContext(),"click on item: "+myListData.decription,Toast.LENGTH_LONG).show();
                //listdata[holder.getAdapterPosition()].setDescription("KAKAK");
                //notifyItemChanged(holder.getAdapterPosition());
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView userAvatar;
        public TextView userEmail;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.userAvatar = (ImageView) itemView.findViewById(R.id.userAvatar);
            this.userEmail = (TextView) itemView.findViewById(R.id.userEmail);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}
