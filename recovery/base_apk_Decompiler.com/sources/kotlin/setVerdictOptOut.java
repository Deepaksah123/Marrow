package kotlin;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.marrow.R;
import com.marrow2.ui.qbank.lesson_list.model.SealedLessonDetailsModel;
import com.marrow2.ui.video.lesson_list.adapter.ClickedLessonDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.bj;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u001a\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018"}, d2 = {"Lo/setVerdictOptOut;", "Lo/consumeCcData;", "Lo/bj$write;", "<init>", "()V", "Landroid/content/res/Configuration;", "p0", "", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/os/Bundle;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lcom/marrow2/ui/video/lesson_list/adapter/ClickedLessonDetails;", "read", "(Lcom/marrow2/ui/video/lesson_list/adapter/ClickedLessonDetails;)V", "Lo/resolveUri;", "AudioAttributesCompatParcelizer", "Lo/resolveUri;", "Lo/bj;", "Lo/bj;", "RemoteActionCompatParcelizer", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setVerdictOptOut extends consumeCcData implements bj.write {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private resolveUri AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private BottomSheetBehavior<?> write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private bj RemoteActionCompatParcelizer;

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onConfigurationChanged(p0);
        if (p0.orientation == 2) {
            BottomSheetBehavior<?> bottomSheetBehavior = this.write;
            if (bottomSheetBehavior == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                bottomSheetBehavior = null;
            }
            bottomSheetBehavior.IconCompatParcelizer(3);
        }
    }

    @Override // kotlin.consumeCcData, kotlin.addMenuProvider, kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        boolean z;
        String string;
        ArrayList<SealedLessonDetailsModel.Lesson> parcelableArrayList;
        Dialog dialogOnCreateDialog = super.onCreateDialog(p0);
        toMagicModuleMetaRepoModel.read(dialogOnCreateDialog, "");
        readNon255TerminatedValue readnon255terminatedvalue = (readNon255TerminatedValue) dialogOnCreateDialog;
        resolveUri resolveuri = resolveUri.read(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resolveuri, "");
        this.AudioAttributesCompatParcelizer = resolveuri;
        bj bjVar = null;
        if (resolveuri == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            resolveuri = null;
        }
        ConstraintLayout constraintLayoutIconCompatParcelizer = resolveuri.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        readnon255terminatedvalue.setContentView(constraintLayoutIconCompatParcelizer);
        resolveUri resolveuri2 = this.AudioAttributesCompatParcelizer;
        if (resolveuri2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            resolveuri2 = null;
        }
        resolveuri2.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.ad
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setVerdictOptOut.read(this.write);
            }
        });
        Object parent = constraintLayoutIconCompatParcelizer.getParent();
        toMagicModuleMetaRepoModel.read(parent, "");
        BottomSheetBehavior<?> bottomSheetBehaviorAudioAttributesCompatParcelizer = BottomSheetBehavior.AudioAttributesCompatParcelizer((View) parent);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bottomSheetBehaviorAudioAttributesCompatParcelizer, "");
        this.write = bottomSheetBehaviorAudioAttributesCompatParcelizer;
        if (bottomSheetBehaviorAudioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            bottomSheetBehaviorAudioAttributesCompatParcelizer = null;
        }
        bottomSheetBehaviorAudioAttributesCompatParcelizer.read(true);
        if (requireActivity().getResources().getConfiguration().orientation == 2) {
            BottomSheetBehavior<?> bottomSheetBehavior = this.write;
            if (bottomSheetBehavior == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                bottomSheetBehavior = null;
            }
            bottomSheetBehavior.IconCompatParcelizer(3);
        } else {
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.write;
            if (bottomSheetBehavior2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                bottomSheetBehavior2 = null;
            }
            bottomSheetBehavior2.IconCompatParcelizer(4);
            BottomSheetBehavior<?> bottomSheetBehavior3 = this.write;
            if (bottomSheetBehavior3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                bottomSheetBehavior3 = null;
            }
            bottomSheetBehavior3.AudioAttributesCompatParcelizer(-1);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("title");
            if (string == null) {
                string = "";
            }
            z = arguments.getBoolean("arePaidLessonsUnlocked");
            parcelableArrayList = arguments.getParcelableArrayList("modules");
        } else {
            z = false;
            string = "";
            parcelableArrayList = null;
        }
        resolveUri resolveuri3 = this.AudioAttributesCompatParcelizer;
        if (resolveuri3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            resolveuri3 = null;
        }
        resolveuri3.AudioAttributesCompatParcelizer.setText(requireContext().getString(R.string.suggestedModulesBottomSheetDescription, string));
        this.RemoteActionCompatParcelizer = new bj(this);
        resolveUri resolveuri4 = this.AudioAttributesCompatParcelizer;
        if (resolveuri4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            resolveuri4 = null;
        }
        RecyclerView recyclerView = resolveuri4.write;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        resolveUri resolveuri5 = this.AudioAttributesCompatParcelizer;
        if (resolveuri5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            resolveuri5 = null;
        }
        RecyclerView recyclerView2 = resolveuri5.write;
        bj bjVar2 = this.RemoteActionCompatParcelizer;
        if (bjVar2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            bjVar2 = null;
        }
        recyclerView2.setAdapter(bjVar2);
        if (parcelableArrayList != null) {
            bj bjVar3 = this.RemoteActionCompatParcelizer;
            if (bjVar3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                bjVar = bjVar3;
            }
            bjVar.AudioAttributesCompatParcelizer(parcelableArrayList, z);
        }
        return readnon255terminatedvalue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setVerdictOptOut setverdictoptout) {
        setverdictoptout.dismiss();
    }

    @Override // o.bj.write
    public final void read(ClickedLessonDetails p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        withAlwaysAsId.read(this, "qBankId", _getIndexResolver.write(new Pair("qBankId", p0)));
        dismiss();
    }

    /* JADX INFO: renamed from: o.setVerdictOptOut$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/setVerdictOptOut$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel$Lesson;", "p1", "", "p2", "Lo/setVerdictOptOut;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/util/List;Z)Lo/setVerdictOptOut;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setVerdictOptOut AudioAttributesCompatParcelizer(String p0, List<SealedLessonDetailsModel.Lesson> p1, boolean p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            setVerdictOptOut setverdictoptout = new setVerdictOptOut();
            Bundle bundle = new Bundle();
            bundle.putString("title", p0);
            bundle.putBoolean("arePaidLessonsUnlocked", p2);
            bundle.putParcelableArrayList("modules", new ArrayList<>(p1));
            setverdictoptout.setArguments(bundle);
            return setverdictoptout;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
