package kotlin;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkModule extends updateTimelineSelection {
    private final getAnswerMap<IOException, getShowPopup> AudioAttributesCompatParcelizer;
    private boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NetworkModule(setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault, getAnswerMap<? super IOException, getShowPopup> getanswermap) {
        super(setcompounddrawableswithintrinsicboundscompatdefault);
        toMagicModuleMetaRepoModel.write(setcompounddrawableswithintrinsicboundscompatdefault, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = getanswermap;
    }

    @Override // kotlin.updateTimelineSelection, kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
    public final void IconCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws EOFException {
        toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
        if (this.write) {
            resetcurrentselectedposition.AudioAttributesImplBaseParcelizer(j);
            return;
        }
        try {
            super.IconCompatParcelizer(resetcurrentselectedposition, j);
        } catch (IOException e) {
            this.write = true;
            this.AudioAttributesCompatParcelizer.invoke(e);
        }
    }

    @Override // kotlin.updateTimelineSelection, kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
    public final void flush() {
        if (this.write) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.write = true;
            this.AudioAttributesCompatParcelizer.invoke(e);
        }
    }

    @Override // kotlin.updateTimelineSelection, kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.write) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.write = true;
            this.AudioAttributesCompatParcelizer.invoke(e);
        }
    }
}
