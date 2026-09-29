package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\f\u001a\u00020\u00068G@FX\u0087\u008c\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R.\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018\"\u0004\b\u000e\u0010\u0019"}, d2 = {"Lo/AppCompatSeekBar;", "", "Lo/setDropDownVerticalOffset;", "p0", "Lo/setDropDownWidth;", "p1", "", "p2", "Lo/setPrecomputedText;", "p3", "<init>", "(Lo/setDropDownVerticalOffset;Lo/setDropDownWidth;FLo/setPrecomputedText;)V", "read", "Lo/setDropDownVerticalOffset;", "AudioAttributesCompatParcelizer", "()Lo/setDropDownVerticalOffset;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/setDropDownWidth;", "()Lo/setDropDownWidth;", "write", "Lo/nextTokenToRead;", "()F", "Lo/setPrecomputedText;", "()Lo/setPrecomputedText;", "(Lo/setPrecomputedText;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppCompatSeekBar {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setDropDownWidth AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private setPrecomputedText IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setDropDownVerticalOffset RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final nextTokenToRead read;

    public AppCompatSeekBar(setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, float f, setPrecomputedText setprecomputedtext) {
        this.RemoteActionCompatParcelizer = setdropdownverticaloffset;
        this.AudioAttributesCompatParcelizer = setdropdownwidth;
        this.read = getInputCodeUtf8.AudioAttributesCompatParcelizer(f);
        this.IconCompatParcelizer = setprecomputedtext;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final setDropDownVerticalOffset getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setDropDownWidth getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ AppCompatSeekBar(setDropDownVerticalOffset setdropdownverticaloffset, setDropDownWidth setdropdownwidth, float f, setPrecomputedText setprecomputedtext, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setdropdownverticaloffset, setdropdownwidth, (i & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i & 8) != 0 ? setImageBitmap.RemoteActionCompatParcelizer(false, null, 3, null) : setprecomputedtext);
    }

    public final float write() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final setPrecomputedText getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(setPrecomputedText setprecomputedtext) {
        this.IconCompatParcelizer = setprecomputedtext;
    }
}
