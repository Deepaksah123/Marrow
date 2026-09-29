package kotlin;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import com.marrow.ui.views.CustomTextView;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes4.dex */
public final class af {
    public static final void RemoteActionCompatParcelizer(formatsMatch formatsmatch, ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel) {
        toMagicModuleMetaRepoModel.write(formatsmatch, "");
        toMagicModuleMetaRepoModel.write(activeRecallQbankLessonUiModel, "");
        Context context = formatsmatch.IconCompatParcelizer().getContext();
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        toMagicModuleMetaRepoModel.write(context);
        int iWrite = shouldEscapeCharacter.Companion.write(context, R.attr.cardViewStrokeWidth, new TypedValue(), true);
        MaterialCardView materialCardView = formatsmatch.AudioAttributesCompatParcelizer;
        if (!activeRecallQbankLessonUiModel.getAudioAttributesImplApi21Parcelizer()) {
            iWrite = 0;
        }
        materialCardView.setStrokeWidth(iWrite);
        int i = activeRecallQbankLessonUiModel.getAudioAttributesImplApi21Parcelizer() ? R.attr.colorSurfaceVariant18 : R.attr.colorSurface;
        MaterialCardView materialCardView2 = formatsmatch.AudioAttributesCompatParcelizer;
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        materialCardView2.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, i, new TypedValue(), true));
        formatsmatch.MediaDescriptionCompat.setText(context.getString(R.string.active_recall_mcqs_count, Integer.valueOf(activeRecallQbankLessonUiModel.getRead())));
        CustomTextView customTextView = formatsmatch.MediaDescriptionCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer((TextView) customTextView, activeRecallQbankLessonUiModel.getAudioAttributesImplApi21Parcelizer() ? R.attr.onBackgroundSurface6 : R.attr.colorOnSurface);
        TextView textView = formatsmatch.RatingCompat;
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(activeRecallQbankLessonUiModel.getAudioAttributesCompatParcelizer())}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        textView.setText(str);
        formatsmatch.AudioAttributesImplApi21Parcelizer.setText(context.getString(R.string.completed_on, new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(activeRecallQbankLessonUiModel.getWrite()))));
        if (activeRecallQbankLessonUiModel.getAudioAttributesImplApi26Parcelizer()) {
            TextView textView2 = formatsmatch.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView2);
            LinearLayout linearLayout = formatsmatch.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
            TextView textView3 = formatsmatch.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView3);
            LinearLayout linearLayout2 = formatsmatch.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout2);
            return;
        }
        if (activeRecallQbankLessonUiModel.getAudioAttributesImplApi21Parcelizer()) {
            TextView textView4 = formatsmatch.MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView4);
            LinearLayout linearLayout3 = formatsmatch.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout3);
            LinearLayout linearLayout4 = formatsmatch.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
            PlayerControlViewExternalSyntheticLambda1.write(linearLayout4);
            TextView textView5 = formatsmatch.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
            PlayerControlViewExternalSyntheticLambda1.write((View) textView5);
            PieChart pieChart = formatsmatch.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pieChart, "");
            dispatchTouchEvent.IconCompatParcelizer(pieChart, activeRecallQbankLessonUiModel.getRemoteActionCompatParcelizer());
            TextView textView6 = formatsmatch.MediaMetadataCompat;
            int remoteActionCompatParcelizer = activeRecallQbankLessonUiModel.getRemoteActionCompatParcelizer();
            StringBuilder sb = new StringBuilder();
            sb.append(remoteActionCompatParcelizer);
            sb.append("%");
            textView6.setText(sb.toString());
            return;
        }
        TextView textView7 = formatsmatch.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView7, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) textView7);
        LinearLayout linearLayout5 = formatsmatch.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout5, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout5);
        TextView textView8 = formatsmatch.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView8, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(textView8);
        LinearLayout linearLayout6 = formatsmatch.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout6, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout6);
    }
}
