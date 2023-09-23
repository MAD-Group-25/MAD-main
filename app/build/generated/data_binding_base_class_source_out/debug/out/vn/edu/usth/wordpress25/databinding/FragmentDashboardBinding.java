// Generated by view binder compiler. Do not edit!
package vn.edu.usth.wordpress25.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.edu.usth.wordpress25.R;

public final class FragmentDashboardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TabLayout DtabLayout;

  @NonNull
  public final ViewPager DviewPager;

  private FragmentDashboardBinding(@NonNull ConstraintLayout rootView,
      @NonNull TabLayout DtabLayout, @NonNull ViewPager DviewPager) {
    this.rootView = rootView;
    this.DtabLayout = DtabLayout;
    this.DviewPager = DviewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.DtabLayout;
      TabLayout DtabLayout = ViewBindings.findChildViewById(rootView, id);
      if (DtabLayout == null) {
        break missingId;
      }

      id = R.id.DviewPager;
      ViewPager DviewPager = ViewBindings.findChildViewById(rootView, id);
      if (DviewPager == null) {
        break missingId;
      }

      return new FragmentDashboardBinding((ConstraintLayout) rootView, DtabLayout, DviewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}