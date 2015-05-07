package com.excuse.arafat.restclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arafat on 07/05/2015.
 */
public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    private List<Entity> ItemList = null;
    private ArrayList<Entity> ItemArraylist;
    int pos;

    public ListViewAdapter(Context mContext,List<Entity> foodEntityList)
    {
        this.mContext = mContext;
        ItemList = foodEntityList;
        inflater = LayoutInflater.from(mContext);
        ItemArraylist = new ArrayList<Entity>();
        ItemArraylist.addAll(ItemList);
    }

    public class ViewHolder
    {
                        //TO DO
        TextView title;
        TextView item1;
        TextView itme2;

    }


    @Override
    public int getCount() {
        return ItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return ItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        pos = getItemViewType(position);

        if(convertView==null)
        {
               //TO DO .....Example below:
           /* holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.order_menu_item,null);
            holder.title = (TextView) convertView.findViewById(R.id.order_menu_item_title);
            holder.price = (TextView) convertView.findViewById(R.id.order_menu_item_price);
            holder.img=  (ImageView)convertView.findViewById(R.id.image_food);
            holder.quantity = (TextView)convertView.findViewById(R.id.quantity);

            holder.plusButton = (Button)convertView.findViewById(R.id.plus_button);

            holder.minusButton = (Button)convertView.findViewById(R.id.minus_button);


            convertView.setTag(holder);*/
        }

        else
        {
            holder = (ViewHolder)convertView.getTag();
        }

        /* TO DO....Examples Below
        holder.plusButton.setTag(pos);
        holder.minusButton.setTag(pos);

        holder.title.setText(foodList.get(position).getFoodItem());
        holder.price.setText(foodList.get(position).getFoodPrice());
        holder.quantity.setText(Integer.toString(foodList.get(position).getQuantity()));

        holder.plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodList.get(position).increaseQuantity();
                notifyDataSetChanged();
            }
        });
        holder.minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodList.get(position).decreaseQuantity();
                notifyDataSetChanged();

            }
        });
        */


        return convertView;
    }
}
