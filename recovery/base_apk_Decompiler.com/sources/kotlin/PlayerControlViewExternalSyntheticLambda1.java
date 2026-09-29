package kotlin;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.marrow.R;
import java.util.Iterator;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerControlViewExternalSyntheticLambda1 {
    public static final void IconCompatParcelizer(TextView textView) {
        toMagicModuleMetaRepoModel.write(textView, "");
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }

    public static final void write(List<? extends View> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(0);
        }
    }

    public static final void read(List<? extends View> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(8);
        }
    }

    public static final void write(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setVisibility(0);
    }

    public static final void AudioAttributesCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setVisibility(8);
    }

    public static final void read(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setVisibility(4);
    }

    public static final void IconCompatParcelizer(TextView textView, int i) {
        toMagicModuleMetaRepoModel.write(textView, "");
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context context = textView.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        textView.setTextColor(shouldEscapeCharacter.Companion.read(context, i, new TypedValue(), true));
    }

    public static final void IconCompatParcelizer(View view, int i) {
        toMagicModuleMetaRepoModel.write(view, "");
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context context = view.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        view.setBackgroundColor(shouldEscapeCharacter.Companion.read(context, i, new TypedValue(), true));
    }

    public static final void read(TextView textView, int i) {
        toMagicModuleMetaRepoModel.write(textView, "");
        textView.setTextColor(_isNaN.getColor(textView.getContext(), i));
    }

    public static final void AudioAttributesCompatParcelizer(ImageView imageView, int i) {
        if (imageView != null) {
            imageView.setImageDrawable(_isNaN.getDrawable(imageView.getContext(), i));
        }
    }

    public static final void write(TextView textView) {
        toMagicModuleMetaRepoModel.write(textView, "");
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(0);
    }

    public static final double IconCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        Rect rect = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect);
        double dHeight = ((double) rect.height()) / ((double) view.getMeasuredHeight());
        if (localVisibleRect) {
            return dHeight * 100.0d;
        }
        return 0.0d;
    }

    public static final void write(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Toast.makeText(context, str, 0).show();
    }

    public static final void write(Fragment fragment, String str) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Context contextRequireContext = fragment.requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        write(contextRequireContext, str);
    }

    public static final void IconCompatParcelizer(Context context, View view) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(view, "");
        int i = context.getResources().getConfiguration().orientation;
        double d = updateNavigation.read(context);
        int i2 = getOnline.read(0.18d * d);
        int i3 = getOnline.read(d * 0.07d);
        if (i == 2) {
            view.setPadding(i2, view.getPaddingTop(), i2, view.getPaddingBottom());
        } else {
            view.setPadding(i3, view.getPaddingTop(), i3, view.getPaddingBottom());
        }
    }

    public static final void write(Context context, View view) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(view, "");
        int i = read(context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i2 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i3 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i4 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i5 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        toMagicModuleMetaRepoModel.read(layoutParams5, "");
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMarginStart(i2 + i);
        marginLayoutParams5.setMarginEnd(i + i4);
        marginLayoutParams5.topMargin = i3;
        marginLayoutParams5.bottomMargin = i5;
        view.setLayoutParams(marginLayoutParams5);
    }

    public static final int read(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        int i = context.getResources().getConfiguration().orientation;
        double d = updateNavigation.read(context);
        return i == 2 ? getOnline.read(0.18d * d) : getOnline.read(d * 0.07d);
    }

    public static final void AudioAttributesCompatParcelizer(TextView textView, String str) {
        toMagicModuleMetaRepoModel.write(textView, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String string = textView.getContext().getString(R.string.pyt_appended_title, str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new buildBitrateString(textView.getContext()), spannableString.toString().length() - 3, spannableString.toString().length(), 17);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    public static final void RemoteActionCompatParcelizer(final View view, long j, final getAnswerMap<? super View, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        final MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        final long j2 = 800;
        view.setOnClickListener(new View.OnClickListener() { // from class: o.removeVisibilityListener
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(view, writeVar, getanswermap, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, o.setPassingYear] */
    public static final void IconCompatParcelizer(View view, MagicModuleUseCaseImplWhenMappings.write writeVar, getAnswerMap getanswermap, long j) {
        hasGetter hasgetterWrite = isCreatorVisible.write(view);
        if (hasgetterWrite != null) {
            setPassingYear setpassingyear = (setPassingYear) writeVar.write;
            if (setpassingyear == null || !setpassingyear.read()) {
                writeVar.write = C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(hasgetterWrite), null, null, new read(getanswermap, view, j, null), 3);
            }
        }
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ long AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ View RemoteActionCompatParcelizer;
        private /* synthetic */ getAnswerMap<View, getShowPopup> read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read.invoke(this.RemoteActionCompatParcelizer);
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(getAnswerMap<? super View, getShowPopup> getanswermap, View view, long j, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.read = getanswermap;
            this.RemoteActionCompatParcelizer = view;
            this.AudioAttributesCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.read, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final void read(ImageView imageView, boolean z) {
        toMagicModuleMetaRepoModel.write(imageView, "");
        imageView.setImageResource(z ? R.drawable.ic_bookmark_filled_v2 : R.drawable.ic_bookmark_unfilled_v2);
    }

    public static final void RemoteActionCompatParcelizer(View... viewArr) {
        toMagicModuleMetaRepoModel.write(viewArr, "");
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    public static final void AudioAttributesCompatParcelizer(View... viewArr) {
        toMagicModuleMetaRepoModel.write(viewArr, "");
        for (View view : viewArr) {
            view.setVisibility(8);
        }
    }

    public static final void RemoteActionCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setVisibility(view.getVisibility() == 0 ? 8 : 0);
    }

    public static final void write(View... viewArr) {
        toMagicModuleMetaRepoModel.write(viewArr, "");
        int length = viewArr.length;
        for (int i = 0; i < 2; i++) {
            viewArr[i].setSelected(false);
        }
    }
}
