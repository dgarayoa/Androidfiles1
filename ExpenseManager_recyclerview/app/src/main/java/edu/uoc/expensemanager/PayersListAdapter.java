package edu.uoc.expensemanager;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


public class PayersListAdapter extends RecyclerView.Adapter<PayersListAdapter.ViewHolder>{
    private PayersInfo[] listdata;
    // private Context activityContext;
    // RecyclerView recyclerView;
    public PayersListAdapter(PayersInfo[] listdata) {
        this.listdata = listdata;
   //     this.activityContext = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item_payers, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final PayersInfo myListData = listdata[position];
        holder.textView_Name.setText(listdata[position].name);
        holder.textView_Email.setText(listdata[position].email);
        //holder.imageView.setImageResource(listdata[position].());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
   //             Intent k = new Intent(activityContext, TripViewActivity.class);
   //             k.putExtra("Description",myListData.decription);
   //             k.putExtra("Date",myListData.date);
   //             activityContext.startActivity(k);

                Toast.makeText(view.getContext(),"click on item: "+myListData.name,Toast.LENGTH_LONG).show();
                //listdata[holder.getAdapterPosition()].setDescription("KAKAK");
                //notifyItemChanged(holder.getAdapterPosition());
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView_Name;
        public TextView textView_Email;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView_Name = (TextView) itemView.findViewById(R.id.textView_name);
            this.textView_Email = (TextView) itemView.findViewById(R.id.textView_email);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}
