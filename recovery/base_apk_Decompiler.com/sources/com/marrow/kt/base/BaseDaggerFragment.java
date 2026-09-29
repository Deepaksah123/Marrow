package com.marrow.kt.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.marrow.kt.base.BaseDaggerFragment;
import kotlin.BaseUrl;
import kotlin.Metadata;
import kotlin.ResolvableApiException;
import kotlin.canceledPendingResult;
import kotlin.getCreatedOnDateMs;
import kotlin.getExtendedEsFrChar;
import kotlin.getNextEventTime;
import kotlin.getProvider;
import kotlin.getShowPopup;
import kotlin.getSpecialNorthAmericanChar;
import kotlin.hasSelectionOverride;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.selectTextTrack;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020&H\u0016¢\u0006\u0004\b\u0015\u0010'J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020&H\u0016¢\u0006\u0004\b\u0017\u0010'J\u000f\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020#H\u0016¢\u0006\u0004\b)\u0010%J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020&H\u0016¢\u0006\u0004\b\r\u0010*J)\u0010,\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b,\u0010-J/\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.\"\u00020/2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f00¢\u0006\u0004\b\r\u00101J\u001f\u0010\u0015\u001a\u00020\f*\u00020/2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f00¢\u0006\u0004\b\u0015\u00102J\u0017\u00103\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020&H\u0016¢\u0006\u0004\b3\u0010'J\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020&H\u0016¢\u0006\u0004\b\u0012\u0010*R\"\u00104\u001a\u00028\u00008\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109"}, d2 = {"Lcom/marrow/kt/base/BaseDaggerFragment;", "Lo/getExtendedEsFrChar;", "P", "Lo/hasSelectionOverride;", "Landroid/view/View$OnClickListener;", "Lo/getSpecialNorthAmericanChar;", "Lo/getNextEventTime;", "<init>", "()V", "", "write", "()I", "", "RemoteActionCompatParcelizer", "Landroid/content/BroadcastReceiver;", "p0", "Landroid/content/IntentFilter;", "p1", "IconCompatParcelizer", "(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Intent;)V", "read", "(Landroid/content/BroadcastReceiver;)V", "onStart", "onStop", "onPause", "onDestroy", "onResume", "Landroid/os/Bundle;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onActivityCreated", "aj_", "", "av_", "()Z", "", "(Ljava/lang/String;)V", "au_", "aw_", "(Ljava/lang/String;Ljava/lang/String;)V", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "", "Landroid/view/View;", "Lkotlin/Function0;", "([Landroid/view/View;Lo/getCreatedOnDateMs;)V", "(Landroid/view/View;Lo/getCreatedOnDateMs;)V", "b_", "mPresenter", "Lo/getExtendedEsFrChar;", "getMPresenter", "()Lo/getExtendedEsFrChar;", "setMPresenter", "(Lo/getExtendedEsFrChar;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseDaggerFragment<P extends getExtendedEsFrChar> extends hasSelectionOverride implements View.OnClickListener, getSpecialNorthAmericanChar, getNextEventTime {

    @setSdkPayload
    public P mPresenter;

    @Override // kotlin.hasSelectionOverride
    public abstract int write();

    public final P getMPresenter() {
        P p = this.mPresenter;
        if (p != null) {
            return p;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void setMPresenter(P p) {
        toMagicModuleMetaRepoModel.write(p, "");
        this.mPresenter = p;
    }

    @Override // kotlin.hasSelectionOverride, kotlin.getExtendedPtDeChar
    public void RemoteActionCompatParcelizer() {
        if (this.read == null || !this.read.isShowing()) {
            return;
        }
        this.read.dismiss();
    }

    @Override // kotlin.hasSelectionOverride
    public final void IconCompatParcelizer(BroadcastReceiver p0, IntentFilter p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        getProvider.getInstance(requireContext()).registerReceiver(p0, p1);
    }

    @Override // kotlin.hasSelectionOverride, kotlin.getNextEventTime
    public final void AudioAttributesCompatParcelizer(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getProvider.getInstance(requireContext()).AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.hasSelectionOverride
    public final void read(BroadcastReceiver p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getProvider.getInstance(requireContext()).IconCompatParcelizer(p0);
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getMPresenter().AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onStop() {
        getMPresenter().MediaBrowserCompatSearchResultReceiver();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        getMPresenter();
        super.onPause();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onDestroy() {
        getMPresenter().AudioAttributesImplApi26Parcelizer();
        super.onDestroy();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getMPresenter().MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.hasSelectionOverride, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        BaseUrl.IconCompatParcelizer(getMPresenter().AudioAttributesImplBaseParcelizer(), p0);
        super.onSaveInstanceState(p0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle p0) {
        super.onActivityCreated(p0);
        if (p0 != null) {
            getMPresenter().write(BaseUrl.write(p0));
        }
    }

    @Override // kotlin.hasSelectionOverride, kotlin.getExtendedPtDeChar
    public void aj_() {
        RemoteActionCompatParcelizer();
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        selectTextTrack selecttexttrack = new selectTextTrack(contextRequireContext, 0, 2, null);
        selecttexttrack.RemoteActionCompatParcelizer();
        this.read = selecttexttrack;
        this.read.show();
    }

    @Override // kotlin.hasSelectionOverride
    public boolean av_() {
        return super.isAdded();
    }

    @Override // kotlin.hasSelectionOverride, kotlin.getExtendedPtDeChar
    public void AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Toast.makeText(getContext(), p0, 0).show();
    }

    @Override // kotlin.getExtendedPtDeChar
    public void read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Toast.makeText(getContext(), p0, 1).show();
    }

    @Override // kotlin.hasSelectionOverride
    public void au_() {
        aD_().onBackPressed();
    }

    @Override // kotlin.hasSelectionOverride
    public final boolean aw_() {
        return super.isDetached();
    }

    @Override // kotlin.getNextEventTime
    public final void RemoteActionCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        isSpecialNorthAmericanChar.Companion companion = isSpecialNorthAmericanChar.INSTANCE;
        AudioAttributesCompatParcelizer(isSpecialNorthAmericanChar.Companion.RemoteActionCompatParcelizer(p0, p1));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int p0, int p1, Intent p2) {
        getMPresenter();
        if (p2 != null) {
            BaseUrl.write(p2.getExtras());
        }
        super.onActivityResult(p0, p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
        return getShowPopup.INSTANCE;
    }

    public static void AudioAttributesCompatParcelizer(View view, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.checkManifestExpression
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BaseDaggerFragment.read(getcreatedondatems);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
    }

    public final void b_(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p0)));
        } catch (Exception unused) {
            IconCompatParcelizer(p0, "");
        }
    }

    public final void IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        startActivityForResult(ResolvableApiException.Companion.read(contextRequireContext, new canceledPendingResult(p0, p1, null, 4, null)), 901);
    }

    public static void RemoteActionCompatParcelizer(View[] p0, final getCreatedOnDateMs<getShowPopup> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        int length = p0.length;
        for (int i = 0; i < 2; i++) {
            AudioAttributesCompatParcelizer(p0[i], new getCreatedOnDateMs() { // from class: o.RtspMessageChannelSenderExternalSyntheticLambda1
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return BaseDaggerFragment.AudioAttributesCompatParcelizer(p1);
                }
            });
        }
    }
}
