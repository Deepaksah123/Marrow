package kotlin;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.setNoDataText;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0016\u001a\u00020\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "impl", "Landroidx/savedstate/internal/SavedStateRegistryImpl;", "<init>", "(Landroidx/savedstate/internal/SavedStateRegistryImpl;)V", "isRestored", "", "()Z", "consumeRestoredStateForKey", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "key", "", "registerSavedStateProvider", "", "provider", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "getSavedStateProvider", "unregisterSavedStateProvider", "recreatorProvider", "Landroidx/savedstate/Recreator$SavedStateProvider;", "runOnNextRecreation", "clazz", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "SavedStateProvider", "AutoRecreated", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setOnChartValueSelectedListener {
    private final setCenterTextOffset IconCompatParcelizer;
    private setNoDataText.write write;

    public interface AudioAttributesCompatParcelizer {
        Bundle read();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface write {
        void IconCompatParcelizer(PieChart pieChart);
    }

    public setOnChartValueSelectedListener(setCenterTextOffset setcentertextoffset) {
        toMagicModuleMetaRepoModel.write(setcentertextoffset, "");
        this.IconCompatParcelizer = setcentertextoffset;
    }

    public final Bundle RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(str);
    }

    public final void IconCompatParcelizer(String str, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, audioAttributesCompatParcelizer);
    }

    public final AudioAttributesCompatParcelizer IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.IconCompatParcelizer(str);
    }

    public final void read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer.write(str);
    }

    public final void write(Class<? extends write> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        if (!this.IconCompatParcelizer.getRead()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        setNoDataText.write writeVar = this.write;
        if (writeVar == null) {
            writeVar = new setNoDataText.write(this);
        }
        this.write = writeVar;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            setNoDataText.write writeVar2 = this.write;
            if (writeVar2 != null) {
                String name = cls.getName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
                writeVar2.AudioAttributesCompatParcelizer(name);
            }
        } catch (NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(cls.getSimpleName());
            sb.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }
}
