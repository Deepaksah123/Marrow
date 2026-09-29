package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import de.hdodenhof.circleimageview.CircleImageView;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes.dex */
public final class PublicKeyCredentialBuilder {

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class read {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[getRawId.values().length];
            try {
                iArr[getRawId.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getRawId.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getRawId.read.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final void AudioAttributesCompatParcelizer(DefaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, boolean z, String str, String str2, getRawId getrawid, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        int i;
        Triple triple;
        int i2;
        int i3;
        int i4;
        toMagicModuleMetaRepoModel.write(defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(getrawid, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        Context context = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.IconCompatParcelizer().getContext();
        TextView textView = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        textView.setVisibility(z ? 0 : 8);
        if (read.IconCompatParcelizer[getrawid.ordinal()] == 1) {
            i = setObjectType.read(4);
        } else {
            i = setObjectType.read(6);
        }
        defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.read.setPadding(i, setObjectType.read(0), i, setObjectType.read(0));
        TextView textView2 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.read;
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        toMagicModuleMetaRepoModel.write(context);
        textView2.setTextAppearance(shouldEscapeCharacter.Companion.AudioAttributesCompatParcelizer(context, read.IconCompatParcelizer[getrawid.ordinal()] == 1 ? R.attr.verySmallText : R.attr.smallText3, new TypedValue(), true));
        TextView textView3 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.read;
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        textView3.setBackgroundTintList(ColorStateList.valueOf(shouldEscapeCharacter.Companion.read(context, R.attr.onSurfaceSepia, new TypedValue(), true)));
        TextView textView4 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.read;
        shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
        textView4.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.onTag, new TypedValue(), true));
        int i5 = read.IconCompatParcelizer[getrawid.ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                throw new RenewEligibleCreator();
            }
            if (z) {
                triple = new Triple(Integer.valueOf(R.attr.colorSurfaceVariant2), Integer.valueOf(setObjectType.IconCompatParcelizer(3.0f)), Integer.valueOf(setObjectType.read(5)));
            } else {
                triple = new Triple(Integer.valueOf(R.attr.onBackgroundSurface4), Integer.valueOf(setObjectType.IconCompatParcelizer(2.0f)), Integer.valueOf(setObjectType.read(0)));
            }
        } else if (z) {
            triple = new Triple(Integer.valueOf(R.attr.colorSurfaceVariant2), Integer.valueOf(setObjectType.IconCompatParcelizer(2.0f)), Integer.valueOf(setObjectType.read(3)));
        } else {
            triple = new Triple(Integer.valueOf(R.attr.colorOnPrimary), Integer.valueOf(setObjectType.IconCompatParcelizer(1.0f)), Integer.valueOf(setObjectType.read(0)));
        }
        int iIntValue = ((Number) triple.AudioAttributesCompatParcelizer()).intValue();
        int iIntValue2 = ((Number) triple.read()).intValue();
        int iIntValue3 = ((Number) triple.RemoteActionCompatParcelizer()).intValue();
        if (read.IconCompatParcelizer[getrawid.ordinal()] == 1) {
            i2 = setObjectType.read(54);
        } else {
            i2 = setObjectType.read(82);
        }
        if (read.IconCompatParcelizer[getrawid.ordinal()] == 1) {
            i3 = setObjectType.read(27);
        } else {
            i3 = setObjectType.read(41);
        }
        int i6 = read.IconCompatParcelizer[getrawid.ordinal()] == 1 ? R.attr.colorSurfaceVariant5 : R.attr.colorSurfaceVariant6;
        MaterialCardView materialCardView = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(materialCardView);
        MaterialCardView materialCardView2 = materialCardView;
        ViewGroup.LayoutParams layoutParams = materialCardView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ConstraintLayout.LayoutParams layoutParams3 = layoutParams2;
        ((ViewGroup.LayoutParams) layoutParams3).width = i2;
        ((ViewGroup.LayoutParams) layoutParams3).height = i2;
        materialCardView2.setLayoutParams(layoutParams2);
        materialCardView.setRadius(i3);
        shouldEscapeCharacter.Companion companion4 = shouldEscapeCharacter.INSTANCE;
        materialCardView.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, i6, new TypedValue(), true));
        shouldEscapeCharacter.Companion companion5 = shouldEscapeCharacter.INSTANCE;
        materialCardView.setStrokeColor(shouldEscapeCharacter.Companion.read(context, iIntValue, new TypedValue(), true));
        materialCardView.setStrokeWidth(iIntValue2);
        materialCardView.setContentPadding(iIntValue3, iIntValue3, iIntValue3, iIntValue3);
        TextView textView5 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.AudioAttributesImplApi21Parcelizer;
        shouldEscapeCharacter.Companion companion6 = shouldEscapeCharacter.INSTANCE;
        textView5.setTextAppearance(shouldEscapeCharacter.Companion.AudioAttributesCompatParcelizer(context, read.IconCompatParcelizer[getrawid.ordinal()] == 1 ? R.attr.textAppearanceHeadline4 : R.attr.textAppearanceHeadline2, new TypedValue(), true));
        TextView textView6 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.AudioAttributesImplApi21Parcelizer;
        shouldEscapeCharacter.Companion companion7 = shouldEscapeCharacter.INSTANCE;
        textView6.setTextColor(shouldEscapeCharacter.Companion.read(context, R.attr.colorOnPrimary, new TypedValue(), true));
        if (read.IconCompatParcelizer[getrawid.ordinal()] == 1) {
            i4 = setObjectType.read(2);
        } else {
            i4 = setObjectType.read(4);
        }
        MaterialCardView materialCardView3 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView3, "");
        MaterialCardView materialCardView4 = materialCardView3;
        ViewGroup.LayoutParams layoutParams4 = materialCardView4.getLayoutParams();
        if (layoutParams4 != null) {
            ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = i4;
            materialCardView4.setLayoutParams(layoutParams5);
            ImageView imageView = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            imageView.setVisibility(getrawid == getRawId.IconCompatParcelizer ? 0 : 8);
            if (str.length() > 0) {
                MaterialCardView materialCardView5 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView5, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialCardView5);
                CircleImageView circleImageView = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(circleImageView, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(circleImageView);
                getcreatedondatems.invoke();
            } else {
                defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.AudioAttributesImplApi21Parcelizer.setText(str2);
                MaterialCardView materialCardView6 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView6, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(materialCardView6);
                CircleImageView circleImageView2 = defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(circleImageView2, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(circleImageView2);
            }
            defaultHlsPlaylistTrackerFirstPrimaryMediaPlaylistListener.IconCompatParcelizer().requestLayout();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
