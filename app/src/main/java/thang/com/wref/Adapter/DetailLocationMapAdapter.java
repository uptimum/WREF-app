package thang.com.wref.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;

import thang.com.wref.R;

public class DetailLocationMapAdapter extends RecyclerView.Adapter<DetailLocationMapAdapter.ViewHodler>{
    private Context context;
    private ArrayList<String> imgURl;

    public DetailLocationMapAdapter(Context context, ArrayList<String> imgURl) {
        this.context = context;
        this.imgURl = imgURl;
    }

    @NonNull
    @Override
    public DetailLocationMapAdapter.ViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_detail_location_map, parent,false);
        return new DetailLocationMapAdapter.ViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailLocationMapAdapter.ViewHodler holder, int position) {
//        Glide.with(context).load(""+imgURl.get(position)).fitCenter().centerCrop().into(holder.img);
        if(position == 0)
            Glide.with(context).load(getImage("anh1")).fitCenter().centerCrop().into(holder.img);
        if(position == 1)
            Glide.with(context).load(getImage("anh2")).fitCenter().centerCrop().into(holder.img);
        if(position == 2)
            Glide.with(context).load(getImage("anh3")).fitCenter().centerCrop().into(holder.img);
        if(position == 3)
            Glide.with(context).load(getImage("anh4")).fitCenter().centerCrop().into(holder.img);
        if(position == 4)
            Glide.with(context).load(getImage("anh5")).fitCenter().centerCrop().into(holder.img);
        if(position == 5)
            Glide.with(context).load(getImage("anh6")).fitCenter().centerCrop().into(holder.img);
    }
    public int getImage(String imageName) {

        int drawableResourceId = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());

        return drawableResourceId;
    }
    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHodler extends RecyclerView.ViewHolder {
        private RoundedImageView img;
        public ViewHodler(@NonNull View itemView) {
            super(itemView);
            img = (RoundedImageView) itemView.findViewById(R.id.img);
        }
    }
}
