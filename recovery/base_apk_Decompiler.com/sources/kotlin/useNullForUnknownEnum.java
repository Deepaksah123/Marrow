package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class useNullForUnknownEnum {
    private long AudioAttributesCompatParcelizer;
    private ArrayList<String> AudioAttributesImplApi21Parcelizer = new ArrayList<>();
    private long AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private long IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private long RemoteActionCompatParcelizer;
    private long read;
    private long write;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append("\nmeasuresWrap: ");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append("\nmeasuresWrapInfeasible: ");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append("\ndetermineGroups: ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("\ninfeasibleDetermineGroups: ");
        sb.append(this.write);
        sb.append("\ngraphOptimizer: ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("\nwidgets: ");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append("\ngraphSolved: ");
        sb.append(this.read);
        sb.append("\nlinearSolved: ");
        sb.append(this.IconCompatParcelizer);
        sb.append("\n");
        return sb.toString();
    }
}
