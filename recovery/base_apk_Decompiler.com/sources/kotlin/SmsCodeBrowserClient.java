package kotlin;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import kotlin.Metadata;
import kotlin.createFloatArray;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0002\u0013\u0012B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\u001d8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 "}, d2 = {"Lo/SmsCodeBrowserClient;", "Lo/argCount;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "onClick", "(Landroid/view/View;)V", "", "(I)V", "Lo/SmsCodeBrowserClient$RemoteActionCompatParcelizer;", "Lo/SmsCodeBrowserClient$RemoteActionCompatParcelizer;", "write", "Lo/buildUri;", "Lo/buildUri;", "()Lo/buildUri;", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmsCodeBrowserClient extends argCount implements View.OnClickListener {
    private static final int[] RemoteActionCompatParcelizer = {1, 4, 5, 6, 8};

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private buildUri read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: loaded from: classes.dex */
    public interface RemoteActionCompatParcelizer {
    }

    private final buildUri write() {
        buildUri builduri = this.read;
        toMagicModuleMetaRepoModel.write(builduri);
        return builduri;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = buildUri.RemoteActionCompatParcelizer(p0, p1);
        LinearLayout linearLayoutIconCompatParcelizer = write().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        return linearLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer();
        IconCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.read = null;
    }

    private final void RemoteActionCompatParcelizer() {
        int[][] iArr = {new int[]{-16842910}, new int[]{R.attr.state_enabled}};
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        int i = CmcdConfigurationRequestConfig.read(contextRequireContext, com.marrow.R.attr.colorOnSurfaceVariant, com.marrow.R.color.n_00);
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i, CmcdConfigurationRequestConfig.read(contextRequireContext2, com.marrow.R.attr.colorPrimary, com.marrow.R.color.mb_50)});
        createFloatArray.Companion companion = createFloatArray.INSTANCE;
        String[] strArrAudioAttributesCompatParcelizer = createFloatArray.Companion.AudioAttributesCompatParcelizer();
        int length = strArrAudioAttributesCompatParcelizer.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = strArrAudioAttributesCompatParcelizer[i2];
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setId(i3);
            createFloatArray.Companion companion2 = createFloatArray.INSTANCE;
            radioButton.setText(createFloatArray.Companion.AudioAttributesCompatParcelizer()[i3]);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setOnClickListener(this);
            write().MediaBrowserCompatCustomActionResultReceiver.addView(radioButton);
            i2++;
            i3++;
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        write().AudioAttributesCompatParcelizer.setAdapter(new ArrayAdapter(requireContext(), R.layout.simple_list_item_1, new String[]{"env1-staging.dailyrounds.org", "om-staging.dailyrounds.org", "kv-staging.dailyrounds.org", "ch-staging.dailyrounds.org", "sd-staging.dailyrounds.org", "ru-staging.dailyrounds.org", "aj-staging.dailyrounds.org", "dh-staging.dailyrounds.org", "sp-staging.dailyrounds.org", "ss-staging.dailyrounds.org", "az-staging.dailyrounds.org", "sm-staging.dailyrounds.org", "dev-staging.dailyrounds.org", "nn-staging.dailyrounds.org", "nkt-staging.dailyrounds.org", "kabir-staging.dailyrounds.org", "ah-staging.dailyrounds.org", "is-staging.dailyrounds.org"}));
    }

    private final void IconCompatParcelizer() {
        write().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.hasOngoingSmsRequest
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmsCodeBrowserClient.AudioAttributesCompatParcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(SmsCodeBrowserClient smsCodeBrowserClient) {
        smsCodeBrowserClient.read();
    }

    private final void read() {
        int i = this.AudioAttributesCompatParcelizer;
        if (i == 4) {
            Editable text = write().AudioAttributesImplApi21Parcelizer.getText();
            String text2 = (text == null || text.length() == 0) ? "https" : write().AudioAttributesImplApi21Parcelizer.getText();
            Editable text3 = write().read.getText();
            CharSequence text4 = (text3 == null || text3.length() == 0) ? "api-a0.marrow.com" : write().read.getText();
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            new createStringArray(text2.toString(), text4.toString());
            throw null;
        }
        if (i == 5) {
            CharSequence text5 = write().write.getText();
            String strConcat = "staging.dailyrounds.org:".concat(String.valueOf((text5 == null || text5.length() == 0) ? "8000" : write().write.getText()));
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            new createStringArray("http", strConcat);
            throw null;
        }
        if (i == 8) {
            Editable text6 = write().AudioAttributesCompatParcelizer.getText();
            String string = text6 != null ? text6.toString() : null;
            String str = string;
            if (str == null || str.length() == 0) {
                Toast.makeText(requireContext(), "Server should be added", 1).show();
                return;
            } else {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                new createStringArray("https", string);
                throw null;
            }
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MaterialAutoCompleteTextView materialAutoCompleteTextView = write().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialAutoCompleteTextView, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(materialAutoCompleteTextView);
        int id = p0.getId();
        createFloatArray.Companion companion = createFloatArray.INSTANCE;
        if (id == getOrderDetails.read(createFloatArray.Companion.AudioAttributesCompatParcelizer(), "Port")) {
            LinearLayout linearLayout = write().AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
            LinearLayout linearLayout2 = write().MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout2);
            LinearLayout linearLayout3 = write().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout3);
            LinearLayout linearLayout4 = write().AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout4);
        } else {
            createFloatArray.Companion companion2 = createFloatArray.INSTANCE;
            if (id == getOrderDetails.read(createFloatArray.Companion.AudioAttributesCompatParcelizer(), "Custom")) {
                LinearLayout linearLayout5 = write().AudioAttributesImplApi26Parcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout5, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout5);
                LinearLayout linearLayout6 = write().RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout6, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout6);
                LinearLayout linearLayout7 = write().AudioAttributesImplBaseParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout7, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout7);
                LinearLayout linearLayout8 = write().MediaBrowserCompatItemReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout8, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout8);
            } else {
                createFloatArray.Companion companion3 = createFloatArray.INSTANCE;
                if (id == getOrderDetails.read(createFloatArray.Companion.AudioAttributesCompatParcelizer(), "Staging Servers")) {
                    LinearLayout linearLayout9 = write().AudioAttributesImplApi26Parcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout9, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout9);
                    MaterialAutoCompleteTextView materialAutoCompleteTextView2 = write().AudioAttributesCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialAutoCompleteTextView2, "");
                    bytesRead.AudioAttributesImplApi21Parcelizer(materialAutoCompleteTextView2);
                } else {
                    LinearLayout linearLayout10 = write().AudioAttributesImplApi26Parcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout10, "");
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout10);
                }
            }
        }
        read(id);
        this.AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer[id];
    }

    private final void read(int p0) {
        createFloatArray.Companion companion = createFloatArray.INSTANCE;
        int length = createFloatArray.Companion.AudioAttributesCompatParcelizer().length;
        int i = 0;
        while (i < length) {
            View childAt = write().MediaBrowserCompatCustomActionResultReceiver.getChildAt(i);
            toMagicModuleMetaRepoModel.read(childAt, "");
            ((RadioButton) childAt).setChecked(i == p0);
            i++;
        }
    }
}
