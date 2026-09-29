package kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.ValueClassSerializerStaticJsonValue;
import kotlin.ValueClassUnboxSerializer;
import kotlin.deserializeZIaKswc;
import kotlin.setEntryLabelTextSize;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueClassSerializer extends deserializeZIaKswc {
    private final UShortDeserializer AudioAttributesCompatParcelizer;
    private final ValueClassUnboxSerializer IconCompatParcelizer;
    private setDrawSliceText MediaBrowserCompatCustomActionResultReceiver;
    private final List<ValueClassSerializerStaticJsonValue.read> RemoteActionCompatParcelizer;
    private final setDrawGridBackground write;

    @Override // kotlin.deserializeZIaKswc
    protected final UShortDeserializer AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.deserializeZIaKswc
    protected final ValueClassUnboxSerializer RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.deserializeZIaKswc
    protected final List<ValueClassSerializerStaticJsonValue.read> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final setEntryLabelTextSize write() {
        setViewPortOffsets setviewportoffsetsRemoteActionCompatParcelizer;
        setDrawGridBackground setdrawgridbackground = this.write;
        setScaleYEnabled setscaleyenabled = setdrawgridbackground instanceof setScaleYEnabled ? (setScaleYEnabled) setdrawgridbackground : null;
        if (setscaleyenabled == null || (setviewportoffsetsRemoteActionCompatParcelizer = setscaleyenabled.RemoteActionCompatParcelizer()) == null) {
            return null;
        }
        return setviewportoffsetsRemoteActionCompatParcelizer.read();
    }

    public ValueClassSerializer(UShortDeserializer uShortDeserializer, ValueClassUnboxSerializer valueClassUnboxSerializer) {
        setDragEnabled setdragenabledAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(uShortDeserializer, "");
        toMagicModuleMetaRepoModel.write(valueClassUnboxSerializer, "");
        this.AudioAttributesCompatParcelizer = uShortDeserializer;
        this.IconCompatParcelizer = valueClassUnboxSerializer;
        List<ValueClassSerializerStaticJsonValue.read> list = uShortDeserializer.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
        if (uShortDeserializer.onCustomAction == null) {
            if (uShortDeserializer.onCommand == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!".toString());
            }
            setEntryLabelTextSize.write.Companion companion = setEntryLabelTextSize.write.INSTANCE;
            setdragenabledAudioAttributesCompatParcelizer = new setScaleYEnabled(new setViewPortOffsets(uShortDeserializer.onCommand.AudioAttributesCompatParcelizer(setEntryLabelTextSize.write.Companion.RemoteActionCompatParcelizer(uShortDeserializer.MediaBrowserCompatCustomActionResultReceiver).write(uShortDeserializer.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer(valueClassUnboxSerializer.RemoteActionCompatParcelizer())).IconCompatParcelizer())));
        } else {
            if (uShortDeserializer.onCustomAction instanceof setDrawWeb) {
                deserializeZIaKswc.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new deserializeZIaKswc.AudioAttributesCompatParcelizer(this, uShortDeserializer.onCustomAction);
                String str = uShortDeserializer.MediaBrowserCompatMediaItem;
                setdragenabledAudioAttributesCompatParcelizer = new setDragEnabled(audioAttributesCompatParcelizer, str != null ? str : ":memory:");
            } else if (uShortDeserializer.MediaBrowserCompatMediaItem == null) {
                setdragenabledAudioAttributesCompatParcelizer = setHighlightPerDragEnabled.read(new deserializeZIaKswc.AudioAttributesCompatParcelizer(this, uShortDeserializer.onCustomAction), ":memory:");
            } else {
                deserializeZIaKswc.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new deserializeZIaKswc.AudioAttributesCompatParcelizer(this, uShortDeserializer.onCustomAction);
                String str2 = uShortDeserializer.MediaBrowserCompatMediaItem;
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(uShortDeserializer.MediaBrowserCompatItemReceiver);
                read(uShortDeserializer.MediaBrowserCompatItemReceiver);
                setdragenabledAudioAttributesCompatParcelizer = setHighlightPerDragEnabled.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer2, str2, iRemoteActionCompatParcelizer, 1);
            }
        }
        this.write = setdragenabledAudioAttributesCompatParcelizer;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    public ValueClassSerializer(UShortDeserializer uShortDeserializer, getAnswerMap<? super UShortDeserializer, ? extends setEntryLabelTextSize> getanswermap) {
        toMagicModuleMetaRepoModel.write(uShortDeserializer, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = uShortDeserializer;
        this.IconCompatParcelizer = new IconCompatParcelizer();
        List<ValueClassSerializerStaticJsonValue.read> list = uShortDeserializer.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
        this.write = new setScaleYEnabled(new setViewPortOffsets(getanswermap.invoke(AudioAttributesCompatParcelizer(uShortDeserializer, (getAnswerMap<? super setDrawSliceText, getShowPopup>) new getAnswerMap() { // from class: o.ValueClassStaticJsonKeySerializerCompanion
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ValueClassSerializer.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (setDrawSliceText) obj);
            }
        }))));
        MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(ValueClassSerializer valueClassSerializer, setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        valueClassSerializer.MediaBrowserCompatCustomActionResultReceiver = setdrawslicetext;
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        boolean z = AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver == ValueClassSerializerStaticJsonValue.IconCompatParcelizer.write;
        setEntryLabelTextSize setentrylabeltextsizeWrite = write();
        if (setentrylabeltextsizeWrite != null) {
            setentrylabeltextsizeWrite.read(z);
        }
    }

    public final <R> Object IconCompatParcelizer(boolean z, MagicModuleSubmissionRequestBody<? super a, ? super SampleVideos<? super R>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super R> sampleVideos) {
        return this.write.IconCompatParcelizer(z, magicModuleSubmissionRequestBody, sampleVideos);
    }

    @Override // kotlin.deserializeZIaKswc
    public final String IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ":memory:")) {
            return str;
        }
        String absolutePath = AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.getDatabasePath(str).getAbsolutePath();
        toMagicModuleMetaRepoModel.write((Object) absolutePath);
        return absolutePath;
    }

    public final void IconCompatParcelizer() {
        this.write.close();
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        setDrawSliceText setdrawslicetext = this.MediaBrowserCompatCustomActionResultReceiver;
        if (setdrawslicetext != null) {
            return setdrawslicetext.AudioAttributesImplBaseParcelizer();
        }
        return false;
    }

    public final class AudioAttributesCompatParcelizer extends setEntryLabelTextSize.RemoteActionCompatParcelizer {
        public AudioAttributesCompatParcelizer(int i) {
            super(i);
        }

        @Override // o.setEntryLabelTextSize.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            ValueClassSerializer.this.IconCompatParcelizer(new setScaleMinima(setdrawslicetext));
        }

        @Override // o.setEntryLabelTextSize.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(setDrawSliceText setdrawslicetext, int i, int i2) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            ValueClassSerializer.this.RemoteActionCompatParcelizer(new setScaleMinima(setdrawslicetext), i, i2);
        }

        @Override // o.setEntryLabelTextSize.RemoteActionCompatParcelizer
        public final void read(setDrawSliceText setdrawslicetext, int i, int i2) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            RemoteActionCompatParcelizer(setdrawslicetext, i, i2);
        }

        @Override // o.setEntryLabelTextSize.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            ValueClassSerializer.this.AudioAttributesCompatParcelizer(new setScaleMinima(setdrawslicetext));
            ValueClassSerializer.this.MediaBrowserCompatCustomActionResultReceiver = setdrawslicetext;
        }
    }

    static final class IconCompatParcelizer extends ValueClassUnboxSerializer {
        public IconCompatParcelizer() {
            super(-1, "", "");
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void IconCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void AudioAttributesImplApi26Parcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final ValueClassUnboxSerializer.IconCompatParcelizer AudioAttributesImplApi21Parcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void AudioAttributesCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void RemoteActionCompatParcelizer(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void write(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }

        @Override // kotlin.ValueClassUnboxSerializer
        public final void read(setDrawHoleEnabled setdrawholeenabled) {
            toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
            throw new IllegalStateException("NOP delegate should never be called".toString());
        }
    }

    public static final class RemoteActionCompatParcelizer extends ValueClassSerializerStaticJsonValue.read {
        final /* synthetic */ getAnswerMap<setDrawSliceText, getShowPopup> read;

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(getAnswerMap<? super setDrawSliceText, getShowPopup> getanswermap) {
            this.read = getanswermap;
        }

        @Override // o.ValueClassSerializerStaticJsonValue.read
        public final void AudioAttributesCompatParcelizer(setDrawSliceText setdrawslicetext) {
            toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
            this.read.invoke(setdrawslicetext);
        }
    }

    private static UShortDeserializer AudioAttributesCompatParcelizer(UShortDeserializer uShortDeserializer, getAnswerMap<? super setDrawSliceText, getShowPopup> getanswermap) {
        List<ValueClassSerializerStaticJsonValue.read> listRemoteActionCompatParcelizer = uShortDeserializer.RemoteActionCompatParcelizer;
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return UShortDeserializer.AudioAttributesCompatParcelizer(uShortDeserializer.MediaBrowserCompatCustomActionResultReceiver, uShortDeserializer.MediaBrowserCompatMediaItem, uShortDeserializer.onCommand, uShortDeserializer.MediaBrowserCompatSearchResultReceiver, IntermediateLoginResponseBody.read((Collection<? extends RemoteActionCompatParcelizer>) listRemoteActionCompatParcelizer, new RemoteActionCompatParcelizer(getanswermap)), uShortDeserializer.AudioAttributesCompatParcelizer, uShortDeserializer.MediaBrowserCompatItemReceiver, uShortDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, uShortDeserializer.onPlay, uShortDeserializer.MediaDescriptionCompat, uShortDeserializer.onAddQueueItem, uShortDeserializer.read, uShortDeserializer.onPlayFromMediaId, uShortDeserializer.AudioAttributesImplApi26Parcelizer, uShortDeserializer.AudioAttributesImplApi21Parcelizer, uShortDeserializer.AudioAttributesImplBaseParcelizer, uShortDeserializer.RatingCompat, uShortDeserializer.onPause, uShortDeserializer.IconCompatParcelizer, uShortDeserializer.write, uShortDeserializer.onCustomAction, uShortDeserializer.handleMediaPlayPauseIfPendingOnHandler);
    }
}
