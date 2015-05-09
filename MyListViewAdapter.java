
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadata;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.List;

public class MyListViewAdapter extends ArrayAdapter<> {

    private Context context;
    private int layout;
    private Cursor cursor;

    public MyListViewAdapter(Context context, int resourceId, List<> items)
    {
        super(context, resourceId, items);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder = new ViewHolder();

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);


        if (convertView == null)
        {
            convertView = mInflater.inflate(/* set row laayout here*/, null);
            holder = new ViewHolder();

            holder.myTextView = (TextView) convertView.findViewById(/* set view id here*/);
            holder.positionTextView= (ImageView) convertView.findViewById(/* set view id here*/);

            convertView.setTag(holder);

        }

        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
            
        holder.nameTextView.setText(/* set item text here*/);
        holder.myImageView.setImage(/* set item image here*/);

        return convertView;
    }

    private class ViewHolder
    {
        TextView myTextView;
        ImageView myImageView
    }
}