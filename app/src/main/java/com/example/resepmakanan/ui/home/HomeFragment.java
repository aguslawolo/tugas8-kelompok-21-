package com.example.resepmakanan.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resepmakanan.Adapter.AdapterResep;
import com.example.resepmakanan.R;
import com.example.resepmakanan.databinding.FragmentHomeBinding;
import com.example.resepmakanan.model.DataResep;
import com.example.resepmakanan.model.ModelResep;
import com.example.resepmakanan.ui.detail.DetailActivity;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    RecyclerView rvResep;
    private ArrayList<ModelResep> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        rvResep = root.findViewById(R.id.rv_resep);
        rvResep.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        list.addAll(DataResep.getListResep());
        AdapterResep adapterResep = new AdapterResep(list);

        rvResep.setAdapter(adapterResep);
        adapterResep.notifyDataSetChanged();

        adapterResep.setOnItemClickCallback(new AdapterResep.OnItemClickCallback() {
            @Override
            public void onItemClicked(ModelResep data) {

                //logic untuk berpindah dan mengirim data ke detail
                Intent kirimData = new Intent(getActivity(), DetailActivity.class);
                kirimData.putExtra("NAMARESEP",data.getNamaResep());
                kirimData.putExtra("GAMBAR",data.getGambarResep());
                kirimData.putExtra("DETAIL",data.getDetailResep());
                startActivity(kirimData);
            }
        });

        return root;
    }

}