package kz.education.tursun.personalworkfive.module.restaurant;

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
import kz.education.tursun.personalworkfive.entity.Restaurant;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private List<Restaurant> restaurants = new ArrayList<>();
    private Context context;

    RestaurantAdapter(Context context) {
        this.context = context;
        restaurants.add(new Restaurant("Restaurant #1", "Restaurant #1 address", R.drawable.banket));
        restaurants.add(new Restaurant("Restaurant #1", "Restaurant #1 address", R.drawable.unico_restaurants));
        restaurants.add(new Restaurant("Restaurant #1", "Restaurant #1 address", R.drawable.simple));
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.restaurant_item, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = restaurants.get(position);
        holder.title.setText(restaurant.getTitle());
        holder.address.setText(restaurant.getAddress());
        Picasso.get().load(restaurant.getResId()).into(holder.icon);
    }

    @Override
    public int getItemCount() {
        if (restaurants == null) return 0;
        return restaurants.size();
    }

    class RestaurantViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView address;
        ImageView icon;

        RestaurantViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            address = itemView.findViewById(R.id.address);
            icon = itemView.findViewById(R.id.icon);
        }
    }
}
