package kz.education.tursun.personalworkfive.module.hostel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kz.education.tursun.personalworkfive.R;
import kz.education.tursun.personalworkfive.entity.Hostel;

public class HostelAdapter extends RecyclerView.Adapter<HostelAdapter.HostelViewHolder> {
    private List<Hostel> hostels = new ArrayList<>();
    private Context context;

    HostelAdapter(Context context) {
        buildHostels();
        this.context = context;
    }

    private void buildHostels(){
        for (int i = 0; i < 2; i++) {
            this.hostels.add(new Hostel("Hostel title #" + i + 1, "Hostel #" + i + 1 + "address"));
        }
    }

    @NonNull
    @Override
    public HostelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hostel_item, parent, false);
        return new HostelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HostelViewHolder holder, int position) {
        Hostel hostel = hostels.get(position);
        holder.title.setText(hostel.getTitle());
        holder.address.setText(hostel.getAddress());
    }

    @Override
    public int getItemCount() {
        if (hostels == null) return 0;
        return hostels.size();
    }

    class HostelViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView address;

        HostelViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            address = itemView.findViewById(R.id.address);
        }
    }
}
