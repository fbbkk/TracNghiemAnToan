package communityuni.com.tracnghiemantoan;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CategoryAdapter  extends RecyclerView.Adapter<CategoryAdapter.Viewholder> {
    private List<CategoryMode> categoryModeList;

    public CategoryAdapter(List<CategoryMode> categoryModeList) {
        this.categoryModeList = categoryModeList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.setData(categoryModeList.get(position).getImageUrl(),categoryModeList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return categoryModeList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
        private CircleImageView imageView;
        private TextView title;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.title);
        }
        private void setData(String url, final String title){
            Glide.with(itemView.getContext()).load(url).into(imageView);
            this.title.setText(title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent setIntent = new Intent(itemView.getContext(),SetsActivity.class);
                    setIntent.putExtra("title",title);
                    itemView.getContext().startActivity(setIntent);
                }
            });
        }
    }
}
