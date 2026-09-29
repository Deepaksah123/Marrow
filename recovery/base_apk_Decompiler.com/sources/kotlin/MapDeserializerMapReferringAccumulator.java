package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class MapDeserializerMapReferringAccumulator extends NumberDeserializersBigDecimalDeserializer {
    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final boolean MediaBrowserCompatItemReceiver() {
        return false;
    }

    MapDeserializerMapReferringAccumulator(JdkDeserializers jdkDeserializers) {
        super(jdkDeserializers);
        jdkDeserializers.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        jdkDeserializers.onPrepareFromUri.AudioAttributesCompatParcelizer();
        this.MediaMetadataCompat = ((_deserializeUsingCreator) jdkDeserializers).IconCompatParcelizer();
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer = false;
        this.write.AudioAttributesImplBaseParcelizer = false;
    }

    private void read(setIncludableProperties setincludableproperties) {
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.add(setincludableproperties);
        setincludableproperties.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatMediaItem);
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer, kotlin.MapDeserializerMapReferring
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        if (!this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver || this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer) {
            return;
        }
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer((int) ((this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.get(0).RatingCompat * ((_deserializeUsingCreator) this.MediaBrowserCompatItemReceiver).AudioAttributesImplApi26Parcelizer()) + 0.5f));
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void read() {
        _deserializeUsingCreator _deserializeusingcreator = (_deserializeUsingCreator) this.MediaBrowserCompatItemReceiver;
        int iWrite = _deserializeusingcreator.write();
        int iRemoteActionCompatParcelizer = _deserializeusingcreator.RemoteActionCompatParcelizer();
        _deserializeusingcreator.AudioAttributesImplApi26Parcelizer();
        if (_deserializeusingcreator.IconCompatParcelizer() == 1) {
            if (iWrite != -1) {
                this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPlayFromSearch.MediaDescriptionCompat.MediaBrowserCompatMediaItem);
                this.MediaBrowserCompatItemReceiver.onPlayFromSearch.MediaDescriptionCompat.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                this.MediaBrowserCompatMediaItem.read = iWrite;
            } else if (iRemoteActionCompatParcelizer != -1) {
                this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPlayFromSearch.MediaDescriptionCompat.write);
                this.MediaBrowserCompatItemReceiver.onPlayFromSearch.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                this.MediaBrowserCompatMediaItem.read = -iRemoteActionCompatParcelizer;
            } else {
                this.MediaBrowserCompatMediaItem.write = true;
                this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPlayFromSearch.MediaDescriptionCompat.write);
                this.MediaBrowserCompatItemReceiver.onPlayFromSearch.MediaDescriptionCompat.write.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
            }
            read(this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.MediaBrowserCompatMediaItem);
            read(this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.write);
            return;
        }
        if (iWrite != -1) {
            this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPlayFromSearch.onPrepareFromUri.MediaBrowserCompatMediaItem);
            this.MediaBrowserCompatItemReceiver.onPlayFromSearch.onPrepareFromUri.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
            this.MediaBrowserCompatMediaItem.read = iWrite;
        } else if (iRemoteActionCompatParcelizer != -1) {
            this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPlayFromSearch.onPrepareFromUri.write);
            this.MediaBrowserCompatItemReceiver.onPlayFromSearch.onPrepareFromUri.write.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
            this.MediaBrowserCompatMediaItem.read = -iRemoteActionCompatParcelizer;
        } else {
            this.MediaBrowserCompatMediaItem.write = true;
            this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatItemReceiver.onPlayFromSearch.onPrepareFromUri.write);
            this.MediaBrowserCompatItemReceiver.onPlayFromSearch.onPrepareFromUri.write.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
        }
        read(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.MediaBrowserCompatMediaItem);
        read(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.write);
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    public final void write() {
        if (((_deserializeUsingCreator) this.MediaBrowserCompatItemReceiver).IconCompatParcelizer() == 1) {
            this.MediaBrowserCompatItemReceiver.onPlayFromMediaId(this.MediaBrowserCompatMediaItem.RatingCompat);
        } else {
            this.MediaBrowserCompatItemReceiver.onMediaButtonEvent(this.MediaBrowserCompatMediaItem.RatingCompat);
        }
    }
}
