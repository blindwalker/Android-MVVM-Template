package at.kropf.homeapp.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import at.kropf.homeapp.R;
import at.kropf.homeapp.di.Injectable;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainFragment extends Fragment implements Injectable {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sample_fragment, container, false);

        ButterKnife.bind(this, v);

        return v;
    }

    @OnClick(R.id.btnHeatOn)
    public void heatOn() {
        Toast.makeText(getActivity(), "click", Toast.LENGTH_LONG).show();
    }
}
