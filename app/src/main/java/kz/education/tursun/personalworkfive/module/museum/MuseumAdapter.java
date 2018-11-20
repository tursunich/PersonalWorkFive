package kz.education.tursun.personalworkfive.module.museum;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import kz.education.tursun.personalworkfive.R;
import kz.education.tursun.personalworkfive.entity.Museum;

public class MuseumAdapter extends RecyclerView.Adapter<MuseumAdapter.MuseumViewHolder> {
    private List<Museum> museums = new ArrayList<>();
    private Context context;

    MuseumAdapter(Context context) {
        museums.add(new Museum("Museum #1", "Museum #1 address", R.drawable.elephant, "09:00-17:00"));
        museums.add(new Museum("Museum #2", "Museum #2 address", R.drawable.kill, "08:00-18:00"));
        museums.add(new Museum("Museum #3", "Museum #3 address", R.drawable.london, "10:00-19:00"));
        this.context = context;
    }

    @NonNull
    @Override
    public MuseumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.museum_item, parent, false);
        return new MuseumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MuseumViewHolder holder, int position) {
        Museum museum = museums.get(position);
        holder.title.setText(museum.getTitle());
        holder.address.setText(museum.getAddress());
        holder.time.setText(museum.getTime());
        Picasso.get().load(museum.getResId()).into(holder.icon);
    }

    @Override
    public int getItemCount() {
        if (museums == null) return 0;
        return museums.size();
    }

    class MuseumViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView address;
        TextView time;
        ImageView icon;

        MuseumViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            address = itemView.findViewById(R.id.address);
            time = itemView.findViewById(R.id.time);
            icon = itemView.findViewById(R.id.icon);
        }
    }
}
