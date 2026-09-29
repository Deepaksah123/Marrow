package kotlin;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class copyWithPeriodUid$RemoteActionCompatParcelizer extends DefaultTrackSelector {
    private /* synthetic */ PlayerNotificationManager1 AudioAttributesCompatParcelizer;
    private /* synthetic */ boolean read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyWithPeriodUid$RemoteActionCompatParcelizer(Context context, AdaptiveTrackSelection.Factory factory, boolean z, PlayerNotificationManager1 playerNotificationManager1) {
        super(context, factory);
        this.read = z;
        this.AudioAttributesCompatParcelizer = playerNotificationManager1;
    }

    @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector
    public final Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, DefaultTrackSelector.Parameters parameters) throws Throwable {
        DefaultTrackSelector.SelectionOverride selectionOverrideWrite;
        toMagicModuleMetaRepoModel.write(mappedTrackInfo, "");
        toMagicModuleMetaRepoModel.write(iArr, "");
        toMagicModuleMetaRepoModel.write(iArr2, "");
        toMagicModuleMetaRepoModel.write(parameters, "");
        TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(trackGroups, "");
        DefaultTrackSelector.SelectionOverride selectionOverride = parameters.getSelectionOverride(0, trackGroups);
        boolean z = this.read;
        if (z && selectionOverride != null) {
            return super.selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        }
        if (!z || this.AudioAttributesCompatParcelizer != PlayerNotificationManager1.RemoteActionCompatParcelizer) {
            selectionOverrideWrite = AudioAttributesCompatParcelizer(trackGroups, iArr[0], parameters, this.AudioAttributesCompatParcelizer);
        } else {
            selectionOverrideWrite = write(trackGroups, iArr[0], parameters);
        }
        if (selectionOverrideWrite != null) {
            DefaultTrackSelector.Parameters.Builder selectionOverride2 = buildUponParameters().setSelectionOverride(0, trackGroups, selectionOverrideWrite);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(selectionOverride2, "");
            setParameters(selectionOverride2);
        }
        return super.selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
    }

    private static DefaultTrackSelector.SelectionOverride AudioAttributesCompatParcelizer(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector.Parameters parameters, PlayerNotificationManager1 playerNotificationManager1) throws Throwable {
        int i = trackGroupArray.length;
        for (int i2 = 0; i2 < i; i2++) {
            TrackGroup trackGroup = trackGroupArray.get(i2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(trackGroup, "");
            int[] iArr2 = iArr[i2];
            int i3 = trackGroup.length;
            for (int i4 = 0; i4 < i3; i4++) {
                if (DefaultTrackSelector.isSupported(iArr2[i4], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    Format format = trackGroup.getFormat(i4);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(format, "");
                    try {
                        Object[] objArr = {Integer.valueOf(format.height)};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1798552305);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.getTrimmedLength("") + 12444, 19 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 360349284, false, "AudioAttributesCompatParcelizer", new Class[]{Integer.TYPE});
                        }
                        if (((Method) objRemoteActionCompatParcelizer).invoke(null, objArr) == playerNotificationManager1) {
                            return new DefaultTrackSelector.SelectionOverride(i2, i4);
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    private static DefaultTrackSelector.SelectionOverride write(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector.Parameters parameters) {
        int i = trackGroupArray.length;
        for (int i2 = 0; i2 < i; i2++) {
            TrackGroup trackGroup = trackGroupArray.get(i2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(trackGroup, "");
            int[] iArr2 = iArr[i2];
            ArrayList arrayList = new ArrayList();
            int i3 = trackGroup.length;
            for (int i4 = 0; i4 < i3; i4++) {
                if (DefaultTrackSelector.isSupported(iArr2[i4], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    Format format = trackGroup.getFormat(i4);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(format, "");
                    if (format.height <= 540) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                int[] iArr3 = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj = arrayList.get(i5);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
                    iArr3[i5] = ((Number) obj).intValue();
                }
                return new DefaultTrackSelector.SelectionOverride(i2, Arrays.copyOf(iArr3, size));
            }
        }
        return null;
    }
}
