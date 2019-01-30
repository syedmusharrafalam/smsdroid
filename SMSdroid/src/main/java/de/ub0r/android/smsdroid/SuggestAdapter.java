package de.ub0r.android.smsdroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Inzamam on 1/10/2019.
 */

public class SuggestAdapter extends RecyclerView.Adapter<SuggestAdapter.MyViewHolder> {
    Context context;
    ArrayList<String> myArray;


    public SuggestAdapter(Context context, ArrayList<String> myArray) {
        this.context = context;
        this.myArray = myArray;

    }

    @Override
    public SuggestAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(de.ub0r.android.smsdroid.R.layout.suggest_item, parent, false);
        // SuggestAdapter.MyViewHolder viewHolders=new SuggestAdapter.MyViewHolder(v,);
        return new MyViewHolder(v);


    }

    @Override
    public void onBindViewHolder(final SuggestAdapter.MyViewHolder holder, final int position) {
        holder.suggestText.setText(myArray.get(position));
        final String text = myArray.get(position);


//        holder.suggestText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               // Toast.makeText(context,holder.suggestText.getText().toString(),Toast.LENGTH_LONG).show();
//
//            }
//        });


//        holder.suggestText.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//
//
//
//                message.setText(text);
//                message.setSelection(text.length());
//
//                return false;
//            }
//        });


    }


    @Override
    public int getItemCount() {
        return myArray.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // ReadMoreTextView suggestText;
        TextView suggestText;


        public MyViewHolder(View itemView) {
            super(itemView);

            //suggestText=(ReadMoreTextView) itemView.findViewById(R.id.text1);
            suggestText = (TextView) itemView.findViewById(de.ub0r.android.smsdroid.R.id.text1);
        }


    }

    public void updateList(ArrayList<String> newList) {

        myArray = new ArrayList<>();

        myArray = newList;
        notifyDataSetChanged();


    }


}
