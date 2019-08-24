package com.gzeinnumer.rajaongkir.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gzeinnumer.rajaongkir.R;
import com.gzeinnumer.rajaongkir.model.ResultsItem;

import java.util.ArrayList;
import java.util.List;

import static com.gzeinnumer.rajaongkir.R.layout.item_city;

//todo 20
//dalam tanda <...> sama dengan todo12
public class AdapterCity extends ArrayAdapter<ResultsItem> {

    //dalam tanda <...> sama dengan todo20
    public AdapterCity(Context context, List<ResultsItem> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent){
        //todo 21 biarkan merah
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(item_city, parent, false);
        }
        TextView cityName = convertView.findViewById(R.id.tv_namacity);
        //item sama dengan todo20
        ResultsItem current = getItem(position);

        if (current!=null){
            cityName.setText(current.getCityName());
        }

        return convertView;
    }


}
