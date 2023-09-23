package vn.edu.usth.wordpress25.ui.home;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import vn.edu.usth.wordpress25.ui.AddSiteActivity;
import vn.edu.usth.wordpress25.R;
import vn.edu.usth.wordpress25.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private View button2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        Dialog dialog = new Dialog(getContext());

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.setContentView(R.layout.dialog_optional);
                dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                dialog.setCancelable(false);

                TextView okay_text = dialog.findViewById(R.id.tv_create);
                TextView cancel_text = dialog.findViewById(R.id.tv_add_self);

                okay_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        goToAddSite();
                        dialog.dismiss();
                    }
                });

                cancel_text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

    }

    private void goToAddSite(){
        Intent intent = new Intent(getContext(), AddSiteActivity.class);
        startActivity(intent);
    }

//    public View findViewByID(int button2) {
//        View view = null;
//
//        return view;
//
//    }
//
//    public void openActivity1(){
//        Intent intent = new Intent(requireActivity(), Activity1.class);
//        startActivity(intent);
//    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}