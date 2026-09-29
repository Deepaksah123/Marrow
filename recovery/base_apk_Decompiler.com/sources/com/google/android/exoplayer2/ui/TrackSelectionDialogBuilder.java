package com.google.android.exoplayer2.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.initExtraTracks;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final DialogCallback callback;
    private final Context context;
    private boolean isDisabled;
    private onMoovContainerAtomRead<TrackGroup, TrackSelectionOverride> overrides;
    private boolean showDisableOption;
    private int themeResId;
    private final CharSequence title;
    private Comparator<Format> trackFormatComparator;
    private final List<Tracks.Group> trackGroups;
    private TrackNameProvider trackNameProvider;

    public interface DialogCallback {
        void onTracksSelected(boolean z, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, List<Tracks.Group> list, DialogCallback dialogCallback) {
        this.context = context;
        this.title = charSequence;
        this.trackGroups = initExtraTracks.write(list);
        this.callback = dialogCallback;
        this.overrides = onMoovContainerAtomRead.AudioAttributesCompatParcelizer();
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, final Player player, final int i) {
        this.context = context;
        this.title = charSequence;
        initExtraTracks<Tracks.Group> groups = (player.isCommandAvailable(30) ? player.getCurrentTracks() : Tracks.EMPTY).getGroups();
        this.trackGroups = new ArrayList();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            Tracks.Group group = groups.get(i2);
            if (group.getType() == i) {
                this.trackGroups.add(group);
            }
        }
        this.overrides = player.getTrackSelectionParameters().overrides;
        this.callback = new DialogCallback() { // from class: com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback
            public final void onTracksSelected(boolean z, Map map) {
                TrackSelectionDialogBuilder.lambda$new$0(player, i, z, map);
            }
        };
    }

    static /* synthetic */ void lambda$new$0(Player player, int i, boolean z, Map map) {
        if (player.isCommandAvailable(29)) {
            TrackSelectionParameters.Builder builderBuildUpon = player.getTrackSelectionParameters().buildUpon();
            builderBuildUpon.setTrackTypeDisabled(i, z);
            builderBuildUpon.clearOverridesOfType(i);
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                builderBuildUpon.addOverride((TrackSelectionOverride) it.next());
            }
            player.setTrackSelectionParameters(builderBuildUpon.build());
        }
    }

    public final TrackSelectionDialogBuilder setTheme(int i) {
        this.themeResId = i;
        return this;
    }

    public final TrackSelectionDialogBuilder setIsDisabled(boolean z) {
        this.isDisabled = z;
        return this;
    }

    public final TrackSelectionDialogBuilder setOverride(TrackSelectionOverride trackSelectionOverride) {
        Map<TrackGroup, TrackSelectionOverride> mapRemoteActionCompatParcelizer;
        if (trackSelectionOverride == null) {
            mapRemoteActionCompatParcelizer = Collections.emptyMap();
        } else {
            mapRemoteActionCompatParcelizer = onMoovContainerAtomRead.RemoteActionCompatParcelizer(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
        }
        return setOverrides(mapRemoteActionCompatParcelizer);
    }

    public final TrackSelectionDialogBuilder setOverrides(Map<TrackGroup, TrackSelectionOverride> map) {
        this.overrides = onMoovContainerAtomRead.write(map);
        return this;
    }

    public final TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z) {
        this.allowAdaptiveSelections = z;
        return this;
    }

    public final TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z) {
        this.allowMultipleOverrides = z;
        return this;
    }

    public final TrackSelectionDialogBuilder setShowDisableOption(boolean z) {
        this.showDisableOption = z;
        return this;
    }

    public final void setTrackFormatComparator(Comparator<Format> comparator) {
        this.trackFormatComparator = comparator;
    }

    public final TrackSelectionDialogBuilder setTrackNameProvider(TrackNameProvider trackNameProvider) {
        this.trackNameProvider = trackNameProvider;
        return this;
    }

    public final Dialog build() {
        Dialog dialogBuildForAndroidX = buildForAndroidX();
        return dialogBuildForAndroidX == null ? buildForPlatform() : dialogBuildForAndroidX;
    }

    private Dialog buildForPlatform() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context, this.themeResId);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
        return builder.setTitle(this.title).setView(viewInflate).setPositiveButton(android.R.string.ok, setUpDialogView(viewInflate)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    private Dialog buildForAndroidX() {
        try {
            Class<?> cls = Class.forName("o.createFullyDrawnExecutor$AudioAttributesCompatParcelizer");
            Object objNewInstance = cls.getConstructor(Context.class, Integer.TYPE).newInstance(this.context, Integer.valueOf(this.themeResId));
            View viewInflate = LayoutInflater.from((Context) cls.getMethod("getContext", new Class[0]).invoke(objNewInstance, new Object[0])).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
            DialogInterface.OnClickListener upDialogView = setUpDialogView(viewInflate);
            cls.getMethod("setTitle", CharSequence.class).invoke(objNewInstance, this.title);
            cls.getMethod("setView", View.class).invoke(objNewInstance, viewInflate);
            cls.getMethod("setPositiveButton", Integer.TYPE, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(android.R.string.ok), upDialogView);
            cls.getMethod("setNegativeButton", Integer.TYPE, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(android.R.string.cancel), null);
            return (Dialog) cls.getMethod("create", new Class[0]).invoke(objNewInstance, new Object[0]);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private DialogInterface.OnClickListener setUpDialogView(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.allowMultipleOverrides);
        trackSelectionView.setAllowAdaptiveSelections(this.allowAdaptiveSelections);
        trackSelectionView.setShowDisableOption(this.showDisableOption);
        TrackNameProvider trackNameProvider = this.trackNameProvider;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.trackGroups, this.isDisabled, this.overrides, this.trackFormatComparator, null);
        return new DialogInterface.OnClickListener() { // from class: com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m157lambda$setUpDialogView$1$comgoogleandroidexoplayer2uiTrackSelectionDialogBuilder(trackSelectionView, dialogInterface, i);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$setUpDialogView$1$com-google-android-exoplayer2-ui-TrackSelectionDialogBuilder, reason: not valid java name */
    final /* synthetic */ void m157lambda$setUpDialogView$1$comgoogleandroidexoplayer2uiTrackSelectionDialogBuilder(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i) {
        this.callback.onTracksSelected(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }
}
