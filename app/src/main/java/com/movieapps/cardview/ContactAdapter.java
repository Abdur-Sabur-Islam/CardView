package com.movieapps.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by acer on 1/30/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {

    ArrayList<Contact> contacts;

    public ContactAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Contact contact = contacts.get(position);
        holder.personImage.setImageResource(contact.getImage_id());
        holder.personName.setText(contact.getPersoneName());
        holder.personEmail.setText(contact.getPersonEmail());
        holder.personPhoneNo.setText(contact.getPersonPhoneNo());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView personImage;
        TextView personName;
        TextView personEmail;
        TextView personPhoneNo;
        public MyViewHolder(View itemView) {
            super(itemView);
            personImage = (ImageView) itemView.findViewById(R.id.imageView);
            personName = (TextView) itemView.findViewById(R.id.personNameTv);
            personEmail = (TextView) itemView.findViewById(R.id.personEmailTv);
            personPhoneNo = (TextView) itemView.findViewById(R.id.personPhoneNoTv);
        }
    }
}
