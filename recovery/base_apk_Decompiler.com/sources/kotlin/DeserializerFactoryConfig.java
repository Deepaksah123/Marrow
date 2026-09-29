package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0013\"\u0004\b\f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Lo/DeserializerFactoryConfig;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/hasIndex;", "", "p0", "p1", "Lkotlin/Function1;", "Lo/getConfigOverride;", "", "p2", "<init>", "(ZZLo/getAnswerMap;)V", "write", "(Lo/getConfigOverride;)V", "read", "Z", "AudioAttributesCompatParcelizer", "(Z)V", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "(Lo/getAnswerMap;)V", "i_", "()Z", "IconCompatParcelizer", "l_"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeserializerFactoryConfig extends _handleOddName.IconCompatParcelizer implements hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super getConfigOverride, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public boolean AudioAttributesCompatParcelizer;
    private boolean read;

    public DeserializerFactoryConfig(boolean z, boolean z2, getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        this.read = z;
        this.AudioAttributesCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.read = z;
    }

    public final void write(getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: i_, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: l_, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        this.RemoteActionCompatParcelizer.invoke(getconfigoverride);
    }
}
