package com.zula.zulahaber.ui.karakterler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zula.zulahaber.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    ArrayList<getKarakter> getKarakterArrayList = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;

    public CustomAdapter(ArrayList<getKarakter> getKarakterArrayList, Context context) {
        this.getKarakterArrayList = getKarakterArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        layoutInflater = layoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.karakter_list, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.karakterTur.setText(getKarakterArrayList.get(position).getKarakterTur());
        holder.karakterAdi.setText(getKarakterArrayList.get(position).getKarakterAdi());
        holder.linearLayout.setTag(holder);

    }

    @Override
    public int getItemCount() {
        return getKarakterArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView karakterTur, karakterAdi;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            karakterTur = itemView.findViewById(R.id.karakterTur);
            karakterAdi = itemView.findViewById(R.id.karakterAdi);
            linearLayout = itemView.findViewById(R.id.lineer);
        }
    }
}
