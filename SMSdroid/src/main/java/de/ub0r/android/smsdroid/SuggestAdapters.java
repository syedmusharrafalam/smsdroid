package de.ub0r.android.smsdroid;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SuggestAdapters extends ArrayAdapter<String> {
    private Activity context;
    private ArrayList<String> suggestions;

    public SuggestAdapters(@NonNull Activity context, ArrayList<String> suggestions) {
        super(context, R.layout.suggest_item,suggestions);
        this.context = context;
        this.suggestions = suggestions;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater =context.getLayoutInflater();
        View item= inflater.inflate(R.layout.suggest_item,null,true);
        TextView suggestText=(TextView) item.findViewById(R.id.text1);
        suggestText.setText(suggestions.get(position));


        return item;
    }
}
