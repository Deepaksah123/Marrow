package kotlin;

import java.util.Iterator;
import kotlin.setIncludableProperties;

/* JADX INFO: loaded from: classes2.dex */
final class NullifyingDeserializer extends NumberDeserializersBigDecimalDeserializer {
    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final boolean MediaBrowserCompatItemReceiver() {
        return false;
    }

    NullifyingDeserializer(JdkDeserializers jdkDeserializers) {
        super(jdkDeserializers);
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = null;
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer = false;
    }

    private void AudioAttributesCompatParcelizer(setIncludableProperties setincludableproperties) {
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer.add(setincludableproperties);
        setincludableproperties.AudioAttributesImplApi21Parcelizer.add(this.MediaBrowserCompatMediaItem);
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void read() {
        if (this.MediaBrowserCompatItemReceiver instanceof _deSerializeBCP47Locale) {
            this.MediaBrowserCompatMediaItem.write = true;
            _deSerializeBCP47Locale _deserializebcp47locale = (_deSerializeBCP47Locale) this.MediaBrowserCompatItemReceiver;
            int iIconCompatParcelizer = _deserializebcp47locale.IconCompatParcelizer();
            boolean zAudioAttributesCompatParcelizer = _deserializebcp47locale.AudioAttributesCompatParcelizer();
            int i = 0;
            if (iIconCompatParcelizer == 0) {
                this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.LEFT;
                while (i < ((JsonNodeDeserializerArrayDeserializer) _deserializebcp47locale).onStop) {
                    JdkDeserializers jdkDeserializers = ((JsonNodeDeserializerArrayDeserializer) _deserializebcp47locale).setSessionImpl[i];
                    if (zAudioAttributesCompatParcelizer || jdkDeserializers.onRewind() != 8) {
                        setIncludableProperties setincludableproperties = jdkDeserializers.MediaDescriptionCompat.MediaBrowserCompatMediaItem;
                        setincludableproperties.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                        this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(setincludableproperties);
                    }
                    i++;
                }
                AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.MediaBrowserCompatMediaItem);
                AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.write);
                return;
            }
            if (iIconCompatParcelizer == 1) {
                this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.RIGHT;
                while (i < ((JsonNodeDeserializerArrayDeserializer) _deserializebcp47locale).onStop) {
                    JdkDeserializers jdkDeserializers2 = ((JsonNodeDeserializerArrayDeserializer) _deserializebcp47locale).setSessionImpl[i];
                    if (zAudioAttributesCompatParcelizer || jdkDeserializers2.onRewind() != 8) {
                        setIncludableProperties setincludableproperties2 = jdkDeserializers2.MediaDescriptionCompat.write;
                        setincludableproperties2.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                        this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(setincludableproperties2);
                    }
                    i++;
                }
                AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.MediaBrowserCompatMediaItem);
                AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.write);
                return;
            }
            if (iIconCompatParcelizer == 2) {
                this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.TOP;
                while (i < ((JsonNodeDeserializerArrayDeserializer) _deserializebcp47locale).onStop) {
                    JdkDeserializers jdkDeserializers3 = ((JsonNodeDeserializerArrayDeserializer) _deserializebcp47locale).setSessionImpl[i];
                    if (zAudioAttributesCompatParcelizer || jdkDeserializers3.onRewind() != 8) {
                        setIncludableProperties setincludableproperties3 = jdkDeserializers3.onPrepareFromUri.MediaBrowserCompatMediaItem;
                        setincludableproperties3.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                        this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(setincludableproperties3);
                    }
                    i++;
                }
                AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.MediaBrowserCompatMediaItem);
                AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.write);
                return;
            }
            if (iIconCompatParcelizer == 3) {
                this.MediaBrowserCompatMediaItem.MediaBrowserCompatCustomActionResultReceiver = setIncludableProperties.read.BOTTOM;
                while (i < ((JsonNodeDeserializerArrayDeserializer) _deserializebcp47locale).onStop) {
                    JdkDeserializers jdkDeserializers4 = ((JsonNodeDeserializerArrayDeserializer) _deserializebcp47locale).setSessionImpl[i];
                    if (zAudioAttributesCompatParcelizer || jdkDeserializers4.onRewind() != 8) {
                        setIncludableProperties setincludableproperties4 = jdkDeserializers4.onPrepareFromUri.write;
                        setincludableproperties4.AudioAttributesCompatParcelizer.add(this.MediaBrowserCompatMediaItem);
                        this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.add(setincludableproperties4);
                    }
                    i++;
                }
                AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.MediaBrowserCompatMediaItem);
                AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.onPrepareFromUri.write);
            }
        }
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer, kotlin.MapDeserializerMapReferring
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        _deSerializeBCP47Locale _deserializebcp47locale = (_deSerializeBCP47Locale) this.MediaBrowserCompatItemReceiver;
        int iIconCompatParcelizer = _deserializebcp47locale.IconCompatParcelizer();
        Iterator<setIncludableProperties> it = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().RatingCompat;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iIconCompatParcelizer == 0 || iIconCompatParcelizer == 2) {
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i2 + _deserializebcp47locale.RemoteActionCompatParcelizer());
        } else {
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i + _deserializebcp47locale.RemoteActionCompatParcelizer());
        }
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    public final void write() {
        if (this.MediaBrowserCompatItemReceiver instanceof _deSerializeBCP47Locale) {
            int iIconCompatParcelizer = ((_deSerializeBCP47Locale) this.MediaBrowserCompatItemReceiver).IconCompatParcelizer();
            if (iIconCompatParcelizer == 0 || iIconCompatParcelizer == 1) {
                this.MediaBrowserCompatItemReceiver.onPlayFromMediaId(this.MediaBrowserCompatMediaItem.RatingCompat);
            } else {
                this.MediaBrowserCompatItemReceiver.onMediaButtonEvent(this.MediaBrowserCompatMediaItem.RatingCompat);
            }
        }
    }
}
