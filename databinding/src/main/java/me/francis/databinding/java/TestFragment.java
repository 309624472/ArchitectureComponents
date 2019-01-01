package me.francis.databinding.java;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import me.francis.databinding.R;
import me.francis.databinding.java.model.UserEntity;
import me.francis.databinding.databinding.FragmentTestBinding;

public class TestFragment extends Fragment {
    public TestFragment() {
        // Required empty public constructor
    }

    public static TestFragment newInstance(String param1, String param2) {
        TestFragment fragment = new TestFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentTestBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false);
        View rootView = binding.getRoot();
        UserEntity userEntity = new UserEntity();
        userEntity.setName("fengyun");
        userEntity.setAge(12);
        binding.setUserEntity(userEntity);
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
