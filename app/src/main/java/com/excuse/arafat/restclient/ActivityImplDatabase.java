package com.excuse.arafat.restclient;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
/*
This is the template activity from where the db connection is made,listview is populated
 */

public class ActivityImplDatabase extends ListActivity {
    /*
    Template Properties, TO DO
    Button go_to_cart;
    NewOrderListViewAdapter newOrderListViewAdapter;
    public static final String DB_NAME = "Food.db";
    public static  final String TABLE_NAME = "food_table";
    public static final String _id = "_id";
    public static final String foof_item = "foof_item";
    public static final String food_price = "food_price";
    static final String LIST_TAG = "Custom_List";
    ExternalDbOpenHelper externalDbOpenHelper;
    SQLiteDatabase database;
    ArrayList<FoodEntity>foodEntityArrayList;
    ArrayList<FoodEntity> foodEntityArrayListForCart = new ArrayList<FoodEntity>();
    int count=0;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_impl_database);

        /*
        externalDbOpenHelper = new ExternalDbOpenHelper(this,DB_NAME);
        database = externalDbOpenHelper.openDataBase();

        foodEntityArrayList = new ArrayList<FoodEntity>();
        Log.e("BAAANGG","BEFORE POPULATE");
        populateFoodList();
        Log.e("BANG","AFTER POPULATE");
        newOrderListViewAdapter =new NewOrderListViewAdapter(this,foodEntityArrayList);
        setListAdapter(newOrderListViewAdapter);


        go_to_cart = (Button)findViewById(R.id.go_to_cart_button);
        go_to_cart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                for(FoodEntity foodEntity: foodEntityArrayList)
                {
                    if(foodEntity.getQuantity()>0)
                    {
                         foodEntityArrayListForCart.add(foodEntity);
                    }
                }
                Intent in = new Intent(NewOrderActivity.this, CartActivity.class);
                in.putExtra(LIST_TAG,foodEntityArrayListForCart);
                startActivity(in);
                finish();
            }
        });
         */
    }



    /*
     private void populateFoodList()
    {
        Log.e("AFTER PATH","LINE1");

        String[] fromColumn = new String[]{_id,foof_item,food_price};
        Log.e("AFTER PATH","LINE2");

        String where = null;
        Log.e("AFTER PATH","LINE3");

        Cursor cursorFoodList = database.query(TABLE_NAME,fromColumn,null,null,null,null,null);
        Log.e("AFTER PATH","BEFORE IF");
        cursorFoodList.moveToFirst();

        if(!cursorFoodList.isAfterLast())
        {

            Log.e("AAA","Entered If");
            do {
                FoodEntity foodEntity = new FoodEntity(String.valueOf(cursorFoodList.getInt(0)),cursorFoodList.getString(1),cursorFoodList.getString(2));
                Log.e("BAAAAAAAAAAAL",cursorFoodList.getString(1));
                foodEntityArrayList.add(foodEntity);
            }while(cursorFoodList.moveToNext());
        }
        Log.e("AFTER PATH","AFTER IF");
        cursorFoodList.close();
    }
     */

}
