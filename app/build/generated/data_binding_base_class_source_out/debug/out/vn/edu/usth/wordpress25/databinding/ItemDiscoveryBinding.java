// Generated by view binder compiler. Do not edit!
package vn.edu.usth.wordpress25.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import vn.edu.usth.wordpress25.R;

public final class ItemDiscoveryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgFavorite;

  @NonNull
  public final ImageView imgShare;

  @NonNull
  public final ImageView imgThreeDot;

  @NonNull
  public final LinearLayout ll;

  @NonNull
  public final LinearLayout llComment;

  @NonNull
  public final LinearLayout llStar;

  @NonNull
  public final TextView tvAuthod;

  @NonNull
  public final TextView tvAuthodAddress;

  @NonNull
  public final TextView tvContent;

  @NonNull
  public final TextView tvTitle;

  private ItemDiscoveryBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imgFavorite,
      @NonNull ImageView imgShare, @NonNull ImageView imgThreeDot, @NonNull LinearLayout ll,
      @NonNull LinearLayout llComment, @NonNull LinearLayout llStar, @NonNull TextView tvAuthod,
      @NonNull TextView tvAuthodAddress, @NonNull TextView tvContent, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.imgFavorite = imgFavorite;
    this.imgShare = imgShare;
    this.imgThreeDot = imgThreeDot;
    this.ll = ll;
    this.llComment = llComment;
    this.llStar = llStar;
    this.tvAuthod = tvAuthod;
    this.tvAuthodAddress = tvAuthodAddress;
    this.tvContent = tvContent;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDiscoveryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_discovery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDiscoveryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_favorite;
      ImageView imgFavorite = ViewBindings.findChildViewById(rootView, id);
      if (imgFavorite == null) {
        break missingId;
      }

      id = R.id.img_share;
      ImageView imgShare = ViewBindings.findChildViewById(rootView, id);
      if (imgShare == null) {
        break missingId;
      }

      id = R.id.img_three_dot;
      ImageView imgThreeDot = ViewBindings.findChildViewById(rootView, id);
      if (imgThreeDot == null) {
        break missingId;
      }

      id = R.id.ll;
      LinearLayout ll = ViewBindings.findChildViewById(rootView, id);
      if (ll == null) {
        break missingId;
      }

      id = R.id.ll_comment;
      LinearLayout llComment = ViewBindings.findChildViewById(rootView, id);
      if (llComment == null) {
        break missingId;
      }

      id = R.id.ll_star;
      LinearLayout llStar = ViewBindings.findChildViewById(rootView, id);
      if (llStar == null) {
        break missingId;
      }

      id = R.id.tv_authod;
      TextView tvAuthod = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthod == null) {
        break missingId;
      }

      id = R.id.tv_authod_address;
      TextView tvAuthodAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthodAddress == null) {
        break missingId;
      }

      id = R.id.tv_content;
      TextView tvContent = ViewBindings.findChildViewById(rootView, id);
      if (tvContent == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ItemDiscoveryBinding((ConstraintLayout) rootView, imgFavorite, imgShare,
          imgThreeDot, ll, llComment, llStar, tvAuthod, tvAuthodAddress, tvContent, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}