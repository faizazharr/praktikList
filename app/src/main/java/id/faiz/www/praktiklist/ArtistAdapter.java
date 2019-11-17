package id.faiz.www.praktiklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ArtistAdapter extends BaseAdapter {
    private List<Artist> artists;
    Context context;
    LayoutInflater inflater;

    public ArtistAdapter(List<Artist> artists, Context context) {
        this.artists = artists;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return artists.size();
    }

    @Override
    public Object getItem(int i) {
        return artists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.card_list, null);
            holder = new ViewHolder();
            holder.avatarView = convertView.findViewById(R.id.avatar);
            holder.namaView= convertView.findViewById(R.id.nama);
            holder.followerView= convertView.findViewById(R.id.folower);

        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.namaView.setText(artists.get(position).getNama());
        holder.followerView.setText(String.valueOf(artists.get(position).getFollower()));
        if (position == 0) {
            convertView.setBackgroundResource(R.);
        } else if (position == 1) {
            convertView.setBackgroundResource(R.);
        }
        return convertView;
    }

    static class ViewHolder {
        ImageView avatarView;
        TextView namaView;
        TextView followerView;
    }
}
