package momocorp.groupfit.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import momocorp.groupfit.Classes.User;
import momocorp.groupfit.R;
import momocorp.groupfit.SignUpInterface;
import momocorp.groupfit.Universal;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BodyBuildingFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BodyBuildingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BodyBuildingFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    User user;
    TextInputEditText heightEdit;
    TextInputEditText weightEdit;
    TextInputEditText ageEdit;
    SignUpInterface signUpInterface;

    private OnFragmentInteractionListener mListener;

    public BodyBuildingFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static BodyBuildingFragment newInstance(User user) {
        BodyBuildingFragment fragment = new BodyBuildingFragment();
        Bundle args = new Bundle();
        args.putParcelable(Universal.FragmentTags.bodybuild.name(), user);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            user = (User) getArguments().get(Universal.FragmentTags.bodybuild.name());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_body_building, container, false);
        heightEdit = (TextInputEditText) view.findViewById(R.id.height);
        weightEdit = (TextInputEditText) view.findViewById(R.id.weight);
        ageEdit = (TextInputEditText) view.findViewById(R.id.age_edit_text);
        signUpInterface = (SignUpInterface) getActivity();
        heightEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setHeight(Integer.parseInt(s.toString()));
            }
        });

        weightEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                user.setWeight(Integer.parseInt(s.toString()));

            }
        });

        ageEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            user.setAge(Integer.parseInt(s.toString()));
            }
        });

        Button next = (Button) view.findViewById(R.id.next_button_body);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            signUpInterface.bodyBuilding(user);
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
