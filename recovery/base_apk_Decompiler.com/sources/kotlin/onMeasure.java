package kotlin;

import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public class onMeasure extends hasSelectionOverride {
    private deriveVideoFormat RemoteActionCompatParcelizer;

    @Override // kotlin.hasSelectionOverride
    public int write() {
        return -1;
    }

    public static onMeasure IconCompatParcelizer(String str) {
        onMeasure onmeasure = new onMeasure();
        Bundle bundle = new Bundle();
        bundle.putString("extra_content", str);
        onmeasure.setArguments(bundle);
        return onmeasure;
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        deriveVideoFormat derivevideoformatIconCompatParcelizer = deriveVideoFormat.IconCompatParcelizer(layoutInflater, viewGroup);
        this.RemoteActionCompatParcelizer = derivevideoformatIconCompatParcelizer;
        return derivevideoformatIconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.setText(a_("extra_content", getString(R.string.video_for_paid_user)));
        CustomButton customButton = this.RemoteActionCompatParcelizer.read;
        try {
            Object[] objArr = {this};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-642351616);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (4275 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11255, 51 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1476412779, false, null, new Class[]{onMeasure.class});
            }
            customButton.setOnClickListener((View.OnClickListener) ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr));
            CustomTextView customTextView = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
            Object[] objArr2 = {this};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1940046436);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 63461), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11307, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, 233506545, false, null, new Class[]{onMeasure.class});
            }
            customTextView.setOnClickListener((View.OnClickListener) ((Constructor) objRemoteActionCompatParcelizer2).newInstance(objArr2));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver() {
        getActivity().finish();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.RemoteActionCompatParcelizer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public void IconCompatParcelizer() {
        startActivity(PlanActivity.RemoteActionCompatParcelizer(getContext(), "Pro Subscription Dialog", "pro_video_accessed"));
    }
}
