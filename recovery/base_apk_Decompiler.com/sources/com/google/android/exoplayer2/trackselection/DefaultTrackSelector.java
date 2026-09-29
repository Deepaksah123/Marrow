package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.checkNonNegative;
import kotlin.initExtraTracks;
import kotlin.parseTextAttribute;
import kotlin.parseTraks;
import kotlin.parseTruns;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class DefaultTrackSelector extends MappingTrackSelector implements RendererCapabilities.Listener {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";
    private AudioAttributes audioAttributes;
    public final Context context;
    private final boolean deviceIsTV;
    private final Object lock;
    private Parameters parameters;
    private SpatializerWrapperV32 spatializer;
    private final ExoTrackSelection.Factory trackSelectionFactory;
    private static final parseTruns<Integer> FORMAT_VALUE_ORDERING = parseTruns.IconCompatParcelizer(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
        }
    });
    private static final parseTruns<Integer> NO_ORDER = parseTruns.IconCompatParcelizer(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.lambda$static$1((Integer) obj, (Integer) obj2);
        }
    });

    static /* synthetic */ int lambda$static$1(Integer num, Integer num2) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return this;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Deprecated
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private final Parameters.Builder delegate;

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @Deprecated
        public final /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        @Deprecated
        public ParametersBuilder() {
            this.delegate = new Parameters.Builder();
        }

        public ParametersBuilder(Context context) {
            this.delegate = new Parameters.Builder(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder set(TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMaxVideoSize(int i, int i2) {
            this.delegate.setMaxVideoSize(i, i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMaxVideoFrameRate(int i) {
            this.delegate.setMaxVideoFrameRate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMaxVideoBitrate(int i) {
            this.delegate.setMaxVideoBitrate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMinVideoSize(int i, int i2) {
            this.delegate.setMinVideoSize(i, i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMinVideoFrameRate(int i) {
            this.delegate.setMinVideoFrameRate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMinVideoBitrate(int i) {
            this.delegate.setMinVideoBitrate(i);
            return this;
        }

        public final ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z);
            return this;
        }

        public final ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public final ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z);
            return this;
        }

        public final ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setViewportSize(int i, int i2, boolean z) {
            this.delegate.setViewportSize(i, i2, z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredVideoMimeType(String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredVideoRoleFlags(int i) {
            this.delegate.setPreferredVideoRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredAudioLanguage(String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredAudioRoleFlags(int i) {
            this.delegate.setPreferredAudioRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMaxAudioChannelCount(int i) {
            this.delegate.setMaxAudioChannelCount(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setMaxAudioBitrate(int i) {
            this.delegate.setMaxAudioBitrate(i);
            return this;
        }

        public final ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z);
            return this;
        }

        public final ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public final ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z);
            return this;
        }

        public final ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z);
            return this;
        }

        public final ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredAudioMimeType(String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredTextLanguage(String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredTextLanguages(String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setPreferredTextRoleFlags(int i) {
            this.delegate.setPreferredTextRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setIgnoredTextSelectionFlags(int i) {
            this.delegate.setIgnoredTextSelectionFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setSelectUndeterminedTextLanguage(boolean z) {
            this.delegate.setSelectUndeterminedTextLanguage(z);
            return this;
        }

        @Deprecated
        public final ParametersBuilder setDisabledTextTrackSelectionFlags(int i) {
            this.delegate.setDisabledTextTrackSelectionFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setForceLowestBitrate(boolean z) {
            this.delegate.setForceLowestBitrate(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setForceHighestSupportedBitrate(boolean z) {
            this.delegate.setForceHighestSupportedBitrate(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder addOverride(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder clearOverride(TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder clearOverridesOfType(int i) {
            this.delegate.clearOverridesOfType(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @Deprecated
        public final ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final ParametersBuilder setTrackTypeDisabled(int i, boolean z) {
            this.delegate.setTrackTypeDisabled(i, z);
            return this;
        }

        public final ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z);
            return this;
        }

        public final ParametersBuilder setTunnelingEnabled(boolean z) {
            this.delegate.setTunnelingEnabled(z);
            return this;
        }

        public final ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z) {
            this.delegate.setAllowMultipleAdaptiveSelections(z);
            return this;
        }

        public final ParametersBuilder setRendererDisabled(int i, boolean z) {
            this.delegate.setRendererDisabled(i, z);
            return this;
        }

        @Deprecated
        public final ParametersBuilder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i, trackGroupArray, selectionOverride);
            return this;
        }

        @Deprecated
        public final ParametersBuilder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i, trackGroupArray);
            return this;
        }

        @Deprecated
        public final ParametersBuilder clearSelectionOverrides(int i) {
            this.delegate.clearSelectionOverrides(i);
            return this;
        }

        @Deprecated
        public final ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public final Parameters build() {
            return this.delegate.build();
        }
    }

    public static final class Parameters extends TrackSelectionParameters implements Bundleable {
        public static final Bundleable.Creator<Parameters> CREATOR;

        @Deprecated
        public static final Parameters DEFAULT;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE;
        private static final String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS;
        private static final String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES;
        private static final String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY;
        private static final String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_RENDERER_DISABLED_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES;
        private static final String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS;
        private static final String FIELD_TUNNELING_ENABLED;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        public static final class Builder extends TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final SparseBooleanArray rendererDisabledFlags;
            private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @Deprecated
            public final /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            @Deprecated
            public Builder() {
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            public Builder(Context context) {
                super(context);
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            private Builder(Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private Builder(Bundle bundle) {
                super(bundle);
                init();
                Parameters parameters = Parameters.DEFAULT_WITHOUT_CONTEXT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(Parameters.FIELD_TUNNELING_ENABLED, parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, parameters.allowMultipleAdaptiveSelections));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(Parameters.FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange));
                this.selectionOverrides = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(Parameters.FIELD_RENDERER_DISABLED_INDICES));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder set(TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMaxVideoSize(int i, int i2) {
                super.setMaxVideoSize(i, i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMaxVideoFrameRate(int i) {
                super.setMaxVideoFrameRate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMaxVideoBitrate(int i) {
                super.setMaxVideoBitrate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMinVideoSize(int i, int i2) {
                super.setMinVideoSize(i, i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMinVideoFrameRate(int i) {
                super.setMinVideoFrameRate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMinVideoBitrate(int i) {
                super.setMinVideoBitrate(i);
                return this;
            }

            public final Builder setExceedVideoConstraintsIfNecessary(boolean z) {
                this.exceedVideoConstraintsIfNecessary = z;
                return this;
            }

            public final Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
                this.allowVideoMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public final Builder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
                this.allowVideoNonSeamlessAdaptiveness = z;
                return this;
            }

            public final Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(context, z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setViewportSize(int i, int i2, boolean z) {
                super.setViewportSize(i, i2, z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredVideoMimeType(String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredVideoRoleFlags(int i) {
                super.setPreferredVideoRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredAudioLanguage(String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredAudioRoleFlags(int i) {
                super.setPreferredAudioRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMaxAudioChannelCount(int i) {
                super.setMaxAudioChannelCount(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setMaxAudioBitrate(int i) {
                super.setMaxAudioBitrate(i);
                return this;
            }

            public final Builder setExceedAudioConstraintsIfNecessary(boolean z) {
                this.exceedAudioConstraintsIfNecessary = z;
                return this;
            }

            public final Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
                this.allowAudioMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public final Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
                this.allowAudioMixedSampleRateAdaptiveness = z;
                return this;
            }

            public final Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
                this.allowAudioMixedChannelCountAdaptiveness = z;
                return this;
            }

            public final Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredAudioMimeType(String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            public final Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z) {
                this.constrainAudioChannelCountToDeviceCapabilities = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredTextLanguage(String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setPreferredTextRoleFlags(int i) {
                super.setPreferredTextRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setIgnoredTextSelectionFlags(int i) {
                super.setIgnoredTextSelectionFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setSelectUndeterminedTextLanguage(boolean z) {
                super.setSelectUndeterminedTextLanguage(z);
                return this;
            }

            @Deprecated
            public final Builder setDisabledTextTrackSelectionFlags(int i) {
                return setIgnoredTextSelectionFlags(i);
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setForceLowestBitrate(boolean z) {
                super.setForceLowestBitrate(z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setForceHighestSupportedBitrate(boolean z) {
                super.setForceHighestSupportedBitrate(z);
                return this;
            }

            public final Builder setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z) {
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder clearOverride(TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @Deprecated
            public final Builder setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Builder setTrackTypeDisabled(int i, boolean z) {
                super.setTrackTypeDisabled(i, z);
                return this;
            }

            public final Builder setExceedRendererCapabilitiesIfNecessary(boolean z) {
                this.exceedRendererCapabilitiesIfNecessary = z;
                return this;
            }

            public final Builder setTunnelingEnabled(boolean z) {
                this.tunnelingEnabled = z;
                return this;
            }

            public final Builder setAllowMultipleAdaptiveSelections(boolean z) {
                this.allowMultipleAdaptiveSelections = z;
                return this;
            }

            public final Builder setRendererDisabled(int i, boolean z) {
                if (this.rendererDisabledFlags.get(i) == z) {
                    return this;
                }
                if (z) {
                    this.rendererDisabledFlags.put(i, true);
                    return this;
                }
                this.rendererDisabledFlags.delete(i);
                return this;
            }

            @Deprecated
            public final Builder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.selectionOverrides.put(i, map);
                }
                if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            @Deprecated
            public final Builder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i);
                    }
                }
                return this;
            }

            @Deprecated
            public final Builder clearSelectionOverrides(int i) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i);
                }
                return this;
            }

            @Deprecated
            public final Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public final Parameters build() {
                return new Parameters(this);
            }

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = false;
            }

            private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
                SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void setSelectionOverridesFromBundle(Bundle bundle) {
                initExtraTracks initextratracksFromBundleList;
                SparseArray sparseArrayFromBundleSparseArray;
                int[] intArray = bundle.getIntArray(Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS);
                if (parcelableArrayList == null) {
                    initextratracksFromBundleList = initExtraTracks.AudioAttributesImplApi26Parcelizer();
                } else {
                    initextratracksFromBundleList = BundleableUtil.fromBundleList(TrackGroupArray.CREATOR, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Parameters.FIELD_SELECTION_OVERRIDES);
                if (sparseParcelableArray == null) {
                    sparseArrayFromBundleSparseArray = new SparseArray();
                } else {
                    sparseArrayFromBundleSparseArray = BundleableUtil.fromBundleSparseArray(SelectionOverride.CREATOR, sparseParcelableArray);
                }
                if (intArray == null || intArray.length != initextratracksFromBundleList.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    setSelectionOverride(intArray[i], (TrackGroupArray) initextratracksFromBundleList.get(i), (SelectionOverride) sparseArrayFromBundleSparseArray.get(i));
                }
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }
        }

        static {
            Parameters parametersBuild = new Builder().build();
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            DEFAULT = parametersBuild;
            FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = Util.intToStringMaxRadix(1000);
            FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = Util.intToStringMaxRadix(1001);
            FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = Util.intToStringMaxRadix(1002);
            FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = Util.intToStringMaxRadix(1003);
            FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = Util.intToStringMaxRadix(1004);
            FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = Util.intToStringMaxRadix(1005);
            FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE);
            FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_ENABLED);
            FIELD_TUNNELING_ENABLED = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
            FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED);
            FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING);
            FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_UNDERRUN);
            FIELD_SELECTION_OVERRIDES = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED);
            FIELD_RENDERER_DISABLED_INDICES = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_DISABLED);
            FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_AUDIO_SINK_ERROR);
            FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Util.intToStringMaxRadix(AnalyticsListener.EVENT_VIDEO_ENABLED);
            FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = Util.intToStringMaxRadix(AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED);
            FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE = Util.intToStringMaxRadix(AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED);
            CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.Bundleable.Creator
                public final Bundleable fromBundle(Bundle bundle) {
                    return new DefaultTrackSelector.Parameters.Builder(bundle).build();
                }
            };
        }

        public static Parameters getDefaults(Context context) {
            return new Builder(context).build();
        }

        private Parameters(Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.allowInvalidateSelectionsOnRendererCapabilitiesChange = builder.allowInvalidateSelectionsOnRendererCapabilitiesChange;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        public final boolean getRendererDisabled(int i) {
            return this.rendererDisabledFlags.get(i);
        }

        @Deprecated
        public final boolean hasSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Deprecated
        public final SelectionOverride getSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final Builder buildUpon() {
            return new Builder();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && this.allowInvalidateSelectionsOnRendererCapabilitiesChange == parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public final int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0)) * 31) + (this.allowInvalidateSelectionsOnRendererCapabilitiesChange ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, com.google.android.exoplayer2.Bundleable
        public final Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(FIELD_TUNNELING_ENABLED, this.tunnelingEnabled);
            bundle.putBoolean(FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, this.allowMultipleAdaptiveSelections);
            bundle.putBoolean(FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, this.allowInvalidateSelectionsOnRendererCapabilitiesChange);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(FIELD_RENDERER_DISABLED_INDICES, getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(FIELD_SELECTION_OVERRIDES_RENDERER_INDICES, parseTextAttribute.write(arrayList));
                bundle.putParcelableArrayList(FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS, BundleableUtil.toBundleArrayList(arrayList2));
                bundle.putSparseParcelableArray(FIELD_SELECTION_OVERRIDES, BundleableUtil.toBundleSparseArray(sparseArray2));
            }
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class SelectionOverride implements Bundleable {
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;
        private static final String FIELD_GROUP_INDEX = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACKS = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_TYPE = Util.intToStringMaxRadix(2);
        public static final Bundleable.Creator<SelectionOverride> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return DefaultTrackSelector.SelectionOverride.lambda$static$0(bundle);
            }
        };

        public SelectionOverride(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public SelectionOverride(int i, int[] iArr, int i2) {
            this.groupIndex = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            this.type = i2;
            Arrays.sort(iArrCopyOf);
        }

        public final boolean containsTrack(int i) {
            for (int i2 : this.tracks) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((this.groupIndex * 31) + Arrays.hashCode(this.tracks)) * 31) + this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(FIELD_GROUP_INDEX, this.groupIndex);
            bundle.putIntArray(FIELD_TRACKS, this.tracks);
            bundle.putInt(FIELD_TRACK_TYPE, this.type);
            return bundle;
        }

        static /* synthetic */ SelectionOverride lambda$static$0(Bundle bundle) {
            int i = bundle.getInt(FIELD_GROUP_INDEX, -1);
            int[] intArray = bundle.getIntArray(FIELD_TRACKS);
            int i2 = bundle.getInt(FIELD_TRACK_TYPE, -1);
            Assertions.checkArgument(i >= 0 && i2 >= 0);
            Assertions.checkNotNull(intArray);
            return new SelectionOverride(i, intArray, i2);
        }
    }

    static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(context, Parameters.getDefaults(context), factory);
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new AdaptiveTrackSelection.Factory());
    }

    @Deprecated
    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (Context) null);
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    private DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory, Context context) {
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (trackSelectionParameters instanceof Parameters) {
            this.parameters = (Parameters) trackSelectionParameters;
        } else {
            this.parameters = (context == null ? Parameters.DEFAULT_WITHOUT_CONTEXT : Parameters.getDefaults(context)).buildUpon().set(trackSelectionParameters).build();
        }
        this.audioAttributes = AudioAttributes.DEFAULT;
        boolean z = context != null && Util.isTv(context);
        this.deviceIsTV = z;
        if (!z && context != null && Util.SDK_INT >= 32) {
            this.spatializer = SpatializerWrapperV32.tryCreateInstance(context);
        }
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void release() {
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            if (Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                spatializerWrapperV32.release();
            }
        }
        super.release();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public Parameters getParameters() {
        Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof Parameters) {
            setParametersInternal((Parameters) trackSelectionParameters);
        }
        setParametersInternal(new Parameters.Builder().set(trackSelectionParameters).build());
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        boolean zEquals;
        synchronized (this.lock) {
            zEquals = this.audioAttributes.equals(audioAttributes);
            this.audioAttributes = audioAttributes;
        }
        if (zEquals) {
            return;
        }
        maybeInvalidateForAudioChannelCountConstraints();
    }

    @Deprecated
    public void setParameters(ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    public void setParameters(Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }

    public Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    private void setParametersInternal(Parameters parameters) {
        boolean zEquals;
        Assertions.checkNotNull(parameters);
        synchronized (this.lock) {
            zEquals = this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (zEquals) {
            return;
        }
        if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
            Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
        invalidate();
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities.Listener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        maybeInvalidateForRendererCapabilitiesChange(renderer);
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    protected final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        Parameters parameters;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            parameters = this.parameters;
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                spatializerWrapperV32.ensureInitialized(this, (Looper) Assertions.checkStateNotNull(Looper.myLooper()));
            }
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (parameters.getRendererDisabled(i) || parameters.disabledTrackTypes.contains(Integer.valueOf(rendererType))) {
                definitionArrSelectAllTracks[i] = null;
            }
        }
        ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArrSelectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i2 = 0; i2 < rendererCount; i2++) {
            rendererConfigurationArr[i2] = (parameters.getRendererDisabled(i2) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i2))) || (mappedTrackInfo.getRendererType(i2) != -2 && exoTrackSelectionArrCreateTrackSelections[i2] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    protected ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        Pair<ExoTrackSelection.Definition, Integer> pairSelectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectVideoTrack != null) {
            definitionArr[((Integer) pairSelectVideoTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectVideoTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectAudioTrack != null) {
            definitionArr[((Integer) pairSelectAudioTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectAudioTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, pairSelectAudioTrack == null ? null : ((ExoTrackSelection.Definition) pairSelectAudioTrack.first).group.getFormat(((ExoTrackSelection.Definition) pairSelectAudioTrack.first).tracks[0]).language);
        if (pairSelectTextTrack != null) {
            definitionArr[((Integer) pairSelectTextTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectTextTrack.first;
        }
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3) {
                definitionArr[i] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i), iArr[i], parameters);
            }
        }
        return definitionArr;
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        return selectTracksForType(2, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda2
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i, TrackGroup trackGroup, int[] iArr3) {
                return DefaultTrackSelector.VideoTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr3, iArr2[i]);
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.VideoTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < mappedTrackInfo.getRendererCount()) {
                if (2 == mappedTrackInfo.getRendererType(i) && mappedTrackInfo.getTrackGroups(i).length > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda5
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i2, TrackGroup trackGroup, int[] iArr3) {
                return this.f$0.m133lambda$selectAudioTrack$3$comgoogleandroidexoplayer2trackselectionDefaultTrackSelector(parameters, z, i2, trackGroup, iArr3);
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.AudioTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$selectAudioTrack$3$com-google-android-exoplayer2-trackselection-DefaultTrackSelector, reason: not valid java name */
    /* synthetic */ List m133lambda$selectAudioTrack$3$comgoogleandroidexoplayer2trackselectionDefaultTrackSelector(Parameters parameters, boolean z, int i, TrackGroup trackGroup, int[] iArr) {
        return AudioTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr, z, new parseTraks() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda4
            @Override // kotlin.parseTraks
            public final boolean apply(Object obj) {
                return this.f$0.isAudioFormatWithinAudioChannelCountConstraints((Format) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(com.google.android.exoplayer2.Format r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r3.parameters     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.constrainAudioChannelCountToDeviceCapabilities     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
            boolean r1 = r3.deviceIsTV     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L53
            int r1 = r4.channelCount     // Catch: java.lang.Throwable -> L56
            r2 = 2
            if (r1 <= r2) goto L53
            boolean r1 = isDolbyAudio(r4)     // Catch: java.lang.Throwable -> L56
            r2 = 32
            if (r1 == 0) goto L28
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L56
            if (r1 < r2) goto L53
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
            boolean r1 = r1.isSpatializationSupported()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L53
        L28:
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L56
            if (r1 < r2) goto L51
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            boolean r1 = r1.isSpatializationSupported()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.isAvailable()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            boolean r1 = r1.isEnabled()     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L51
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L56
            com.google.android.exoplayer2.audio.AudioAttributes r3 = r3.audioAttributes     // Catch: java.lang.Throwable -> L56
            boolean r3 = r1.canBeSpatialized(r3, r4)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L51
            goto L53
        L51:
            r3 = 0
            goto L54
        L53:
            r3 = 1
        L54:
            monitor-exit(r0)
            return r3
        L56:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isAudioFormatWithinAudioChannelCountConstraints(com.google.android.exoplayer2.Format):boolean");
    }

    protected Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final Parameters parameters, final String str) throws ExoPlaybackException {
        return selectTracksForType(3, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda7
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i, TrackGroup trackGroup, int[] iArr2) {
                return DefaultTrackSelector.TextTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr2, str);
            }
        }, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.TextTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    protected ExoTrackSelection.Definition selectOtherTrack(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.length; i3++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroup2.length; i4++) {
                if (isSupported(iArr2[i4], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.getFormat(i4), iArr2[i4]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i2 = i4;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i2);
    }

    private <T extends TrackInfo<T>> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
        int i2;
        RandomAccess randomAccess;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mappedTrackInfo.getRendererCount();
        int i3 = 0;
        while (i3 < rendererCount) {
            if (i == mappedTrackInfo2.getRendererType(i3)) {
                TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i3);
                for (int i4 = 0; i4 < trackGroups.length; i4++) {
                    TrackGroup trackGroup = trackGroups.get(i4);
                    List<T> listCreate = factory.create(i3, trackGroup, iArr[i3][i4]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i5 = 0;
                    while (i5 < trackGroup.length) {
                        T t = listCreate.get(i5);
                        int selectionEligibility = t.getSelectionEligibility();
                        if (zArr[i5] || selectionEligibility == 0) {
                            i2 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccess = initExtraTracks.read(t);
                                i2 = rendererCount;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < trackGroup.length) {
                                    T t2 = listCreate.get(i6);
                                    int i7 = rendererCount;
                                    if (t2.getSelectionEligibility() == 2 && t.isCompatibleForAdaptationWith(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    rendererCount = i7;
                                }
                                i2 = rendererCount;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5++;
                        rendererCount = i2;
                    }
                }
            }
            i3++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((TrackInfo) list.get(i8)).trackIndex;
        }
        TrackInfo trackInfo = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), Integer.valueOf(trackInfo.rendererIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r1 = r3.parameters     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.constrainAudioChannelCountToDeviceCapabilities     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            boolean r1 = r3.deviceIsTV     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L1f
            int r1 = com.google.android.exoplayer2.util.Util.SDK_INT     // Catch: java.lang.Throwable -> L27
            r2 = 32
            if (r1 < r2) goto L1f
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32 r1 = r3.spatializer     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            boolean r1 = r1.isSpatializationSupported()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            monitor-exit(r0)
            if (r1 == 0) goto L26
            r3.invalidate()
        L26:
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints():void");
    }

    private void maybeInvalidateForRendererCapabilitiesChange(Renderer renderer) {
        boolean z;
        synchronized (this.lock) {
            z = this.parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
        }
        if (z) {
            invalidateForRendererCapabilitiesChange(renderer);
        }
    }

    private static void applyTrackSelectionOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        HashMap map = new HashMap();
        for (int i = 0; i < rendererCount; i++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i), trackSelectionParameters, map);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, map);
        for (int i2 = 0; i2 < rendererCount; i2++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(Integer.valueOf(mappedTrackInfo.getRendererType(i2)));
            if (trackSelectionOverride != null) {
                definitionArr[i2] = (trackSelectionOverride.trackIndices.isEmpty() || mappedTrackInfo.getTrackGroups(i2).indexOf(trackSelectionOverride.mediaTrackGroup) == -1) ? null : new ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, parseTextAttribute.write(trackSelectionOverride.trackIndices));
            }
        }
    }

    private static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, Map<Integer, TrackSelectionOverride> map) {
        TrackSelectionOverride trackSelectionOverride;
        for (int i = 0; i < trackGroupArray.length; i++) {
            TrackSelectionOverride trackSelectionOverride2 = trackSelectionParameters.overrides.get(trackGroupArray.get(i));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    private static void applyLegacyRendererOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i = 0; i < rendererCount; i++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            if (parameters.hasSelectionOverride(i, trackGroups)) {
                SelectionOverride selectionOverride = parameters.getSelectionOverride(i, trackGroups);
                definitionArr[i] = (selectionOverride == null || selectionOverride.tracks.length == 0) ? null : new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
            }
        }
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < mappedTrackInfo.getRendererCount(); i3++) {
            int rendererType = mappedTrackInfo.getRendererType(i3);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i3], mappedTrackInfo.getTrackGroups(i3), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
        }
        z = true;
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(true);
            rendererConfigurationArr[i2] = rendererConfiguration;
            rendererConfigurationArr[i] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i = 0; i < exoTrackSelection.length(); i++) {
            if (RendererCapabilities.getTunnelingSupport(iArr[iIndexOf][exoTrackSelection.getIndexInTrackGroup(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSupported(int i, boolean z) {
        int formatSupport = RendererCapabilities.getFormatSupport(i);
        if (formatSupport != 4) {
            return z && formatSupport == 3;
        }
        return true;
    }

    protected static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    protected static int getFormatLanguageScore(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (z && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        return Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull2, "-")[0].equals(Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i4 = 0; i4 < trackGroup.length; i4++) {
                Format format = trackGroup.getFormat(i4);
                if (format.width > 0 && format.height > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z, i, i2, format.width, format.height);
                    int i5 = format.width * format.height;
                    if (format.width >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && format.height >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i5 < i3) {
                        i3 = i5;
                    }
                }
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 > r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 != r3) goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.google.android.exoplayer2.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getVideoCodecPreferenceScore(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1851077871: goto L3b;
                case -1662735862: goto L31;
                case -1662541442: goto L27;
                case 1331836730: goto L1d;
                case 1599127257: goto L13;
                default: goto L12;
            }
        L12:
            goto L45
        L13:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r2
            goto L46
        L1d:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r3
            goto L46
        L27:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r4
            goto L46
        L31:
            java.lang.String r1 = "video/av01"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r5
            goto L46
        L3b:
            java.lang.String r1 = "video/dolby-vision"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L45
            r6 = r0
            goto L46
        L45:
            r6 = -1
        L46:
            if (r6 == 0) goto L55
            if (r6 == r5) goto L54
            if (r6 == r4) goto L53
            if (r6 == r3) goto L52
            if (r6 == r2) goto L51
            return r0
        L51:
            return r4
        L52:
            return r5
        L53:
            return r3
        L54:
            return r2
        L55:
            r6 = 5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getVideoCodecPreferenceScore(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isDolbyAudio(com.google.android.exoplayer2.Format r5) {
        /*
            java.lang.String r0 = r5.sampleMimeType
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r5 = r5.sampleMimeType
            r5.hashCode()
            int r0 = r5.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -2123537834: goto L34;
                case 187078296: goto L2a;
                case 187078297: goto L20;
                case 1504578661: goto L16;
                default: goto L15;
            }
        L15:
            goto L3e
        L16:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r2
            goto L3f
        L20:
            java.lang.String r0 = "audio/ac4"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r3
            goto L3f
        L2a:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r4
            goto L3f
        L34:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L3e
            r5 = r1
            goto L3f
        L3e:
            r5 = -1
        L3f:
            if (r5 == 0) goto L48
            if (r5 == r4) goto L48
            if (r5 == r3) goto L48
            if (r5 == r2) goto L48
            return r1
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isDolbyAudio(com.google.android.exoplayer2.Format):boolean");
    }

    static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final Format format;
        public final int rendererIndex;
        public final TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory<T extends TrackInfo<T>> {
            List<T> create(int i, TrackGroup trackGroup, int[] iArr);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t);

        public TrackInfo(int i, TrackGroup trackGroup, int i2) {
            this.rendererIndex = i;
            this.trackGroup = trackGroup;
            this.trackIndex = i2;
            this.format = trackGroup.getFormat(i2);
        }
    }

    static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static initExtraTracks<VideoTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, int i2) {
            int maxVideoPixelsToRetainForViewport = DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                int pixelCount = trackGroup.getFormat(i3).getPixelCount();
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new VideoTrackInfo(i, trackGroup, i3, parameters, iArr[i3], i2, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }

        public VideoTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, int i4, boolean z) {
            super(i, trackGroup, i2);
            this.parameters = parameters;
            int i5 = parameters.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowVideoMixedMimeTypeAdaptiveness && (i4 & i5) != 0;
            this.isWithinMaxConstraints = z && (this.format.width == -1 || this.format.width <= parameters.maxVideoWidth) && ((this.format.height == -1 || this.format.height <= parameters.maxVideoHeight) && ((this.format.frameRate == -1.0f || this.format.frameRate <= ((float) parameters.maxVideoFrameRate)) && (this.format.bitrate == -1 || this.format.bitrate <= parameters.maxVideoBitrate)));
            this.isWithinMinConstraints = z && (this.format.width == -1 || this.format.width >= parameters.minVideoWidth) && ((this.format.height == -1 || this.format.height >= parameters.minVideoHeight) && ((this.format.frameRate == -1.0f || this.format.frameRate >= ((float) parameters.minVideoFrameRate)) && (this.format.bitrate == -1 || this.format.bitrate >= parameters.minVideoBitrate)));
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i3, false);
            this.bitrate = this.format.bitrate;
            this.pixelCount = this.format.getPixelCount();
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredVideoRoleFlags);
            this.hasMainOrNoRoleFlag = this.format.roleFlags == 0 || (this.format.roleFlags & 1) != 0;
            int i6 = 0;
            while (true) {
                if (i6 >= parameters.preferredVideoMimeTypes.size()) {
                    i6 = Integer.MAX_VALUE;
                    break;
                } else if (this.format.sampleMimeType != null && this.format.sampleMimeType.equals(parameters.preferredVideoMimeTypes.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            this.preferredMimeTypeMatchIndex = i6;
            this.usesPrimaryDecoder = RendererCapabilities.getDecoderSupport(i3) == 128;
            this.usesHardwareAcceleration = RendererCapabilities.getHardwareAccelerationSupport(i3) == 64;
            this.codecPreferenceScore = DefaultTrackSelector.getVideoCodecPreferenceScore(this.format.sampleMimeType);
            this.selectionEligibility = evaluateSelectionEligibility(i3, i5);
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean isCompatibleForAdaptationWith(VideoTrackInfo videoTrackInfo) {
            if (!this.allowMixedMimeTypes && !Util.areEqual(this.format.sampleMimeType, videoTrackInfo.format.sampleMimeType)) {
                return false;
            }
            if (this.parameters.allowVideoMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == videoTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration;
        }

        private int evaluateSelectionEligibility(int i, int i2) {
            if ((this.format.roleFlags & 16384) != 0 || !DefaultTrackSelector.isSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (this.isWithinMaxConstraints || this.parameters.exceedVideoConstraintsIfNecessary) {
                return (!DefaultTrackSelector.isSupported(i, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1 || this.parameters.forceHighestSupportedBitrate || this.parameters.forceLowestBitrate || (i & i2) == 0) ? 1 : 2;
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            checkNonNegative checknonnegativeIconCompatParcelizer = checkNonNegative.write().IconCompatParcelizer(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities).AudioAttributesCompatParcelizer(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).IconCompatParcelizer(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).IconCompatParcelizer(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).IconCompatParcelizer(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints);
            int i = videoTrackInfo.preferredMimeTypeMatchIndex;
            int i2 = videoTrackInfo2.preferredMimeTypeMatchIndex;
            checkNonNegative checknonnegativeIconCompatParcelizer2 = checknonnegativeIconCompatParcelizer.AudioAttributesCompatParcelizer(Integer.valueOf(i), Integer.valueOf(i2), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).IconCompatParcelizer(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).IconCompatParcelizer(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration);
            if (videoTrackInfo.usesPrimaryDecoder && videoTrackInfo.usesHardwareAcceleration) {
                checknonnegativeIconCompatParcelizer2 = checknonnegativeIconCompatParcelizer2.AudioAttributesCompatParcelizer(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return checknonnegativeIconCompatParcelizer2.read();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            parseTruns parsetrunsAudioAttributesCompatParcelizer = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.AudioAttributesCompatParcelizer();
            return checkNonNegative.write().AudioAttributesCompatParcelizer(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), videoTrackInfo.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.AudioAttributesCompatParcelizer() : DefaultTrackSelector.NO_ORDER).AudioAttributesCompatParcelizer(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), parsetrunsAudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), parsetrunsAudioAttributesCompatParcelizer).read();
        }

        public static int compareSelections(List<VideoTrackInfo> list, List<VideoTrackInfo> list2) {
            return checkNonNegative.write().AudioAttributesCompatParcelizer((VideoTrackInfo) Collections.max(list, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), (VideoTrackInfo) Collections.max(list2, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }).AudioAttributesCompatParcelizer(list.size(), list2.size()).AudioAttributesCompatParcelizer((VideoTrackInfo) Collections.max(list, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), (VideoTrackInfo) Collections.max(list2, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), new Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }).read();
        }
    }

    static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static initExtraTracks<AudioTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, boolean z, parseTraks<Format> parsetraks) {
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new AudioTrackInfo(i, trackGroup, i2, parameters, iArr[i2], z, parsetraks));
            }
            return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }

        public AudioTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, boolean z, parseTraks<Format> parsetraks) {
            int i4;
            int formatLanguageScore;
            int formatLanguageScore2;
            super(i, trackGroup, i2);
            this.parameters = parameters;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i3, false);
            int i5 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i5 >= parameters.preferredAudioLanguages.size()) {
                    formatLanguageScore = 0;
                    i5 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, parameters.preferredAudioLanguages.get(i5), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.preferredLanguageIndex = i5;
            this.preferredLanguageScore = formatLanguageScore;
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            this.hasMainOrNoRoleFlag = this.format.roleFlags == 0 || (this.format.roleFlags & 1) != 0;
            this.isDefaultSelectionFlag = (this.format.selectionFlags & 1) != 0;
            this.channelCount = this.format.channelCount;
            this.sampleRate = this.format.sampleRate;
            this.bitrate = this.format.bitrate;
            this.isWithinConstraints = (this.format.bitrate == -1 || this.format.bitrate <= parameters.maxAudioBitrate) && (this.format.channelCount == -1 || this.format.channelCount <= parameters.maxAudioChannelCount) && parsetraks.apply(this.format);
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i6 = 0;
            while (true) {
                if (i6 >= systemLanguageCodes.length) {
                    formatLanguageScore2 = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i6], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.localeLanguageMatchIndex = i6;
            this.localeLanguageScore = formatLanguageScore2;
            int i7 = 0;
            while (true) {
                if (i7 < parameters.preferredAudioMimeTypes.size()) {
                    if (this.format.sampleMimeType != null && this.format.sampleMimeType.equals(parameters.preferredAudioMimeTypes.get(i7))) {
                        i4 = i7;
                        break;
                    }
                    i7++;
                } else {
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i4;
            this.usesPrimaryDecoder = RendererCapabilities.getDecoderSupport(i3) == 128;
            this.usesHardwareAcceleration = RendererCapabilities.getHardwareAccelerationSupport(i3) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i3, z);
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean isCompatibleForAdaptationWith(AudioTrackInfo audioTrackInfo) {
            if (!this.parameters.allowAudioMixedChannelCountAdaptiveness && (this.format.channelCount == -1 || this.format.channelCount != audioTrackInfo.format.channelCount)) {
                return false;
            }
            if (!this.parameters.allowAudioMixedMimeTypeAdaptiveness && (this.format.sampleMimeType == null || !TextUtils.equals(this.format.sampleMimeType, audioTrackInfo.format.sampleMimeType))) {
                return false;
            }
            if (!this.parameters.allowAudioMixedSampleRateAdaptiveness && (this.format.sampleRate == -1 || this.format.sampleRate != audioTrackInfo.format.sampleRate)) {
                return false;
            }
            if (this.parameters.allowAudioMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration;
        }

        @Override // java.lang.Comparable
        public final int compareTo(AudioTrackInfo audioTrackInfo) {
            parseTruns parsetrunsAudioAttributesCompatParcelizer = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.AudioAttributesCompatParcelizer();
            checkNonNegative checknonnegativeAudioAttributesCompatParcelizer = checkNonNegative.write().IconCompatParcelizer(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities).AudioAttributesCompatParcelizer(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(audioTrackInfo.preferredLanguageIndex), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).AudioAttributesCompatParcelizer(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).IconCompatParcelizer(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).IconCompatParcelizer(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).AudioAttributesCompatParcelizer(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).IconCompatParcelizer(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).AudioAttributesCompatParcelizer(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), this.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.AudioAttributesCompatParcelizer() : DefaultTrackSelector.NO_ORDER).IconCompatParcelizer(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).IconCompatParcelizer(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).AudioAttributesCompatParcelizer(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackInfo.channelCount), parsetrunsAudioAttributesCompatParcelizer).AudioAttributesCompatParcelizer(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackInfo.sampleRate), parsetrunsAudioAttributesCompatParcelizer);
            int i = this.bitrate;
            int i2 = audioTrackInfo.bitrate;
            if (!Util.areEqual(this.language, audioTrackInfo.language)) {
                parsetrunsAudioAttributesCompatParcelizer = DefaultTrackSelector.NO_ORDER;
            }
            return checknonnegativeAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(Integer.valueOf(i), Integer.valueOf(i2), parsetrunsAudioAttributesCompatParcelizer).read();
        }

        private int evaluateSelectionEligibility(int i, boolean z) {
            if (!DefaultTrackSelector.isSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinConstraints && !this.parameters.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            if (!DefaultTrackSelector.isSupported(i, false) || !this.isWithinConstraints || this.format.bitrate == -1 || this.parameters.forceHighestSupportedBitrate || this.parameters.forceLowestBitrate) {
                return 1;
            }
            return (this.parameters.allowMultipleAdaptiveSelections || !z) ? 2 : 1;
        }

        public static int compareSelections(List<AudioTrackInfo> list, List<AudioTrackInfo> list2) {
            return ((AudioTrackInfo) Collections.max(list)).compareTo((AudioTrackInfo) Collections.max(list2));
        }
    }

    static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final boolean isCompatibleForAdaptationWith(TextTrackInfo textTrackInfo) {
            return false;
        }

        public static initExtraTracks<TextTrackInfo> createForTrackGroup(int i, TrackGroup trackGroup, Parameters parameters, int[] iArr, String str) {
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new TextTrackInfo(i, trackGroup, i2, parameters, iArr[i2], str));
            }
            return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }

        public TextTrackInfo(int i, TrackGroup trackGroup, int i2, Parameters parameters, int i3, String str) {
            initExtraTracks<String> initextratracks;
            int formatLanguageScore;
            super(i, trackGroup, i2);
            int i4 = 0;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i3, false);
            int i5 = this.format.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            this.isDefault = (i5 & 1) != 0;
            this.isForced = (i5 & 2) != 0;
            if (parameters.preferredTextLanguages.isEmpty()) {
                initextratracks = initExtraTracks.read("");
            } else {
                initextratracks = parameters.preferredTextLanguages;
            }
            int i6 = 0;
            while (true) {
                if (i6 >= initextratracks.size()) {
                    i6 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, initextratracks.get(i6), parameters.selectUndeterminedTextLanguage);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.preferredLanguageIndex = i6;
            this.preferredLanguageScore = formatLanguageScore;
            int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            this.hasCaptionRoleFlags = (this.format.roleFlags & 1088) != 0;
            int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore2;
            boolean z = formatLanguageScore > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || this.isDefault || (this.isForced && formatLanguageScore2 > 0);
            if (DefaultTrackSelector.isSupported(i3, parameters.exceedRendererCapabilitiesIfNecessary) && z) {
                i4 = 1;
            }
            this.selectionEligibility = i4;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public final int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // java.lang.Comparable
        public final int compareTo(TextTrackInfo textTrackInfo) {
            checkNonNegative checknonnegativeAudioAttributesCompatParcelizer = checkNonNegative.write().IconCompatParcelizer(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities).AudioAttributesCompatParcelizer(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(textTrackInfo.preferredLanguageIndex), parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).AudioAttributesCompatParcelizer(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).IconCompatParcelizer(this.isDefault, textTrackInfo.isDefault).AudioAttributesCompatParcelizer(Boolean.valueOf(this.isForced), Boolean.valueOf(textTrackInfo.isForced), this.preferredLanguageScore == 0 ? parseTruns.IconCompatParcelizer() : parseTruns.IconCompatParcelizer().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                checknonnegativeAudioAttributesCompatParcelizer = checknonnegativeAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return checknonnegativeAudioAttributesCompatParcelizer.read();
        }

        public static int compareSelections(List<TextTrackInfo> list, List<TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format, int i) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(OtherTrackScore otherTrackScore) {
            return checkNonNegative.write().IconCompatParcelizer(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).IconCompatParcelizer(this.isDefault, otherTrackScore.isDefault).read();
        }
    }

    static class SpatializerWrapperV32 {
        private Handler handler;
        private Spatializer.OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final Spatializer spatializer;

        public static SpatializerWrapperV32 tryCreateInstance(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new SpatializerWrapperV32(audioManager.getSpatializer());
        }

        private SpatializerWrapperV32(Spatializer spatializer) {
            this.spatializer = spatializer;
            this.spatializationSupported = spatializer.getImmersiveAudioLevel() != 0;
        }

        public void ensureInitialized(final DefaultTrackSelector defaultTrackSelector, Looper looper) {
            if (this.listener == null && this.handler == null) {
                this.listener = new Spatializer.OnSpatializerStateChangedListener() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }

                    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }
                };
                final Handler handler = new Handler(looper);
                this.handler = handler;
                this.spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SpatializerWrapperV32$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                }, this.listener);
            }
        }

        public boolean isSpatializationSupported() {
            return this.spatializationSupported;
        }

        public boolean isAvailable() {
            return this.spatializer.isAvailable();
        }

        public boolean isEnabled() {
            return this.spatializer.isEnabled();
        }

        public boolean canBeSpatialized(AudioAttributes audioAttributes, Format format) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(Util.getAudioTrackChannelConfig((MimeTypes.AUDIO_E_AC3_JOC.equals(format.sampleMimeType) && format.channelCount == 16) ? 12 : format.channelCount));
            if (format.sampleRate != -1) {
                channelMask.setSampleRate(format.sampleRate);
            }
            return this.spatializer.canBeSpatialized(audioAttributes.getAudioAttributesV21().audioAttributes, channelMask.build());
        }

        public void release() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.listener;
            if (onSpatializerStateChangedListener == null || this.handler == null) {
                return;
            }
            this.spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) Util.castNonNull(this.handler)).removeCallbacksAndMessages(null);
            this.handler = null;
            this.listener = null;
        }
    }
}
