// Generated by view binder compiler. Do not edit!
package vn.edu.usth.wordpress25.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.edu.usth.wordpress25.R;

public final class FragmentCommentsononthersitesBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView24;

  @NonNull
  public final LinearLayout notiftab1;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView101;

  @NonNull
  public final TextView textView1011;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView181;

  @NonNull
  public final TextView textView1811;

  @NonNull
  public final TextView textView23;

  @NonNull
  public final TextView textView24;

  private FragmentCommentsononthersitesBinding(@NonNull FrameLayout rootView,
      @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView24,
      @NonNull LinearLayout notiftab1, @NonNull TextView textView10, @NonNull TextView textView101,
      @NonNull TextView textView1011, @NonNull TextView textView18, @NonNull TextView textView181,
      @NonNull TextView textView1811, @NonNull TextView textView23, @NonNull TextView textView24) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.imageView24 = imageView24;
    this.notiftab1 = notiftab1;
    this.textView10 = textView10;
    this.textView101 = textView101;
    this.textView1011 = textView1011;
    this.textView18 = textView18;
    this.textView181 = textView181;
    this.textView1811 = textView1811;
    this.textView23 = textView23;
    this.textView24 = textView24;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCommentsononthersitesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCommentsononthersitesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_commentsononthersites, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCommentsononthersitesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView24;
      ImageView imageView24 = ViewBindings.findChildViewById(rootView, id);
      if (imageView24 == null) {
        break missingId;
      }

      id = R.id.notiftab1;
      LinearLayout notiftab1 = ViewBindings.findChildViewById(rootView, id);
      if (notiftab1 == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView101;
      TextView textView101 = ViewBindings.findChildViewById(rootView, id);
      if (textView101 == null) {
        break missingId;
      }

      id = R.id.textView1011;
      TextView textView1011 = ViewBindings.findChildViewById(rootView, id);
      if (textView1011 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView181;
      TextView textView181 = ViewBindings.findChildViewById(rootView, id);
      if (textView181 == null) {
        break missingId;
      }

      id = R.id.textView1811;
      TextView textView1811 = ViewBindings.findChildViewById(rootView, id);
      if (textView1811 == null) {
        break missingId;
      }

      id = R.id.textView23;
      TextView textView23 = ViewBindings.findChildViewById(rootView, id);
      if (textView23 == null) {
        break missingId;
      }

      id = R.id.textView24;
      TextView textView24 = ViewBindings.findChildViewById(rootView, id);
      if (textView24 == null) {
        break missingId;
      }

      return new FragmentCommentsononthersitesBinding((FrameLayout) rootView, imageView, imageView2,
          imageView24, notiftab1, textView10, textView101, textView1011, textView18, textView181,
          textView1811, textView23, textView24);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}