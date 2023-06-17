package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.sinhvien;

import java.util.List;

public class SvAdapter extends RecyclerView.Adapter<SvAdapter.SvViewHolder> {

    private Context context;
    private List<sinhvien> list;

    public SvAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<sinhvien> list){
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sv, parent, false);
        return new SvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SvViewHolder holder, int position) {
         sinhvien sv = list.get(position);
         if(sv == null){
             return;
         }

         holder.name.setText(sv.getName());
         holder.namsinh.setText(sv.getNamsinh());
         holder.quequan.setText(sv.getQuequan());
         holder.msv.setText(sv.getId());
         holder.namhoc.setText(sv.getNamhoc());

    }

    @Override
    public int getItemCount() {
        if(list != null){
            return list.size();
        }
        return 0;
    }

    public class SvViewHolder extends RecyclerView.ViewHolder{

        private TextView name, namsinh, quequan, msv, namhoc;
        public SvViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.sinhvien_hoten);
            namsinh = itemView.findViewById(R.id.sinhvien_namsinh);
            quequan = itemView.findViewById(R.id.sinhvien_quequan);
            msv = itemView.findViewById(R.id.sinhvien_msv);
            namhoc = itemView.findViewById(R.id.nam_hoc);
        }
    }
}
