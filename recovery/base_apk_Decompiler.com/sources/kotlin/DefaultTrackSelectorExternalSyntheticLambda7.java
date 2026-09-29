package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.marrow.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultTrackSelectorExternalSyntheticLambda7 extends argCount {
    private final int IconCompatParcelizer;
    private final selectVideoTrack read;
    private createSegment write;

    public DefaultTrackSelectorExternalSyntheticLambda7(Context context, int i, selectVideoTrack selectvideotrack) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(selectvideotrack, "");
        this.IconCompatParcelizer = i;
        this.read = selectvideotrack;
    }

    private final createSegment write() {
        createSegment createsegment = this.write;
        toMagicModuleMetaRepoModel.write(createsegment);
        return createsegment;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(layoutInflater, "");
        setCancelable(false);
        this.write = createSegment.RemoteActionCompatParcelizer(layoutInflater, viewGroup);
        return write().IconCompatParcelizer();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List listRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(view, "");
        super.onViewCreated(view, bundle);
        int i = this.IconCompatParcelizer;
        if (i == 15001) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{getString(R.string.soft_block_rooted_heading), getString(R.string.soft_block_rooted_body), getString(R.string.soft_block_rooted_note), getString(R.string.soft_block_rooted_checkbox)});
        } else if (i == 15002) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{getString(R.string.soft_block_emulator_heading), getString(R.string.soft_block_emulator_body), getString(R.string.soft_block_emulator_note), getString(R.string.soft_block_emulator_checkbox)});
        } else {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{getString(R.string.soft_block_pvpb_heading), getString(R.string.soft_block_pvpb_body), getString(R.string.soft_block_pvpb_note), getString(R.string.soft_block_pvpb_checkbox)});
        }
        Object obj = listRemoteActionCompatParcelizer.get(0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
        Object obj2 = listRemoteActionCompatParcelizer.get(1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj2, "");
        Object obj3 = listRemoteActionCompatParcelizer.get(2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj3, "");
        Object obj4 = listRemoteActionCompatParcelizer.get(3);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj4, "");
        final createSegment createsegmentWrite = write();
        createsegmentWrite.write.setText((String) obj);
        createsegmentWrite.RemoteActionCompatParcelizer.setText((String) obj2);
        Linkify.addLinks(createsegmentWrite.RemoteActionCompatParcelizer, 1);
        createsegmentWrite.RemoteActionCompatParcelizer.setMovementMethod(LinkMovementMethod.getInstance());
        createsegmentWrite.AudioAttributesImplBaseParcelizer.setText((String) obj3);
        createsegmentWrite.IconCompatParcelizer.setText((String) obj4);
        createsegmentWrite.IconCompatParcelizer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.compareSelections
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                DefaultTrackSelectorExternalSyntheticLambda7.AudioAttributesCompatParcelizer(createsegmentWrite, z);
            }
        });
        createsegmentWrite.IconCompatParcelizer.setChecked(false);
        createsegmentWrite.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.DefaultTrackSelectorAudioTrackInfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DefaultTrackSelectorExternalSyntheticLambda7.write(this.IconCompatParcelizer);
            }
        });
        createsegmentWrite.read.setOnClickListener(new View.OnClickListener() { // from class: o.DefaultTrackSelectorExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DefaultTrackSelectorExternalSyntheticLambda7.IconCompatParcelizer(this.write);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(createSegment createsegment, boolean z) {
        createsegment.AudioAttributesCompatParcelizer.setAlpha(z ? 1.0f : 0.8f);
        createsegment.AudioAttributesCompatParcelizer.setClickable(z);
        createsegment.AudioAttributesCompatParcelizer.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(DefaultTrackSelectorExternalSyntheticLambda7 defaultTrackSelectorExternalSyntheticLambda7) {
        defaultTrackSelectorExternalSyntheticLambda7.read.read();
        defaultTrackSelectorExternalSyntheticLambda7.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(DefaultTrackSelectorExternalSyntheticLambda7 defaultTrackSelectorExternalSyntheticLambda7) {
        Context context = defaultTrackSelectorExternalSyntheticLambda7.getContext();
        String string = defaultTrackSelectorExternalSyntheticLambda7.getString(R.string.soft_block_acc_logged_out, Integer.valueOf(defaultTrackSelectorExternalSyntheticLambda7.IconCompatParcelizer));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        scheduleUpdate.AudioAttributesCompatParcelizer(context, "legal@marrowmed.com", string, "");
        defaultTrackSelectorExternalSyntheticLambda7.read.read();
        defaultTrackSelectorExternalSyntheticLambda7.dismiss();
    }
}
