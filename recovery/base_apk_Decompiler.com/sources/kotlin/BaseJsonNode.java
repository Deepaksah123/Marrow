package kotlin;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import kotlin.FileSerializer;
import kotlin.PropertyBuilder;
import kotlin._ensureOverride;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseJsonNode implements customSerializers {
    private boolean AudioAttributesImplBaseParcelizer;
    private final _findSerializer IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final Context read;
    private boolean write;
    private int AudioAttributesImplApi21Parcelizer = 0;
    private long AudioAttributesCompatParcelizer = 5000;
    private serializeFilteredAnyProperties MediaBrowserCompatCustomActionResultReceiver = serializeFilteredAnyProperties.AudioAttributesCompatParcelizer;

    public BaseJsonNode(Context context) {
        this.read = context;
        this.IconCompatParcelizer = new _findSerializer(context);
    }

    @Override // kotlin.customSerializers
    public final buildIndexedListSerializer[] AudioAttributesCompatParcelizer(Handler handler, Annotations annotations, modifyMapLikeSerializer modifymaplikeserializer, _hasNTypeParameters _hasntypeparameters, valueToString valuetostring) {
        ArrayList<buildIndexedListSerializer> arrayList = new ArrayList<>();
        IconCompatParcelizer(this.read, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, handler, annotations, this.AudioAttributesCompatParcelizer, arrayList);
        serializePolymorphic serializepolymorphicIconCompatParcelizer = IconCompatParcelizer(this.read, false, false);
        if (serializepolymorphicIconCompatParcelizer != null) {
            RemoteActionCompatParcelizer(this.read, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, serializepolymorphicIconCompatParcelizer, handler, modifymaplikeserializer, arrayList);
        }
        AudioAttributesCompatParcelizer(_hasntypeparameters, handler.getLooper(), arrayList);
        IconCompatParcelizer(valuetostring, handler.getLooper(), arrayList);
        RemoteActionCompatParcelizer(arrayList);
        read(arrayList);
        return (buildIndexedListSerializer[]) arrayList.toArray(new buildIndexedListSerializer[0]);
    }

    private void IconCompatParcelizer(Context context, int i, serializeFilteredAnyProperties serializefilteredanyproperties, boolean z, Handler handler, Annotations annotations, long j, ArrayList<buildIndexedListSerializer> arrayList) {
        int i2;
        int i3;
        arrayList.add(new getAllInput(context, AudioAttributesCompatParcelizer(), serializefilteredanyproperties, j, z, handler, annotations));
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    i2 = size + 1;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating VP9 extension", e);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (buildIndexedListSerializer) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, Annotations.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, annotations, 50));
                prune.write("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i2;
                i2 = size;
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (buildIndexedListSerializer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, Annotations.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, annotations, 50));
                        prune.write("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    arrayList.add(i3, (buildIndexedListSerializer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, Annotations.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, annotations, 50));
                    prune.write("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating AV1 extension", e3);
            }
        }
    }

    private void RemoteActionCompatParcelizer(Context context, int i, serializeFilteredAnyProperties serializefilteredanyproperties, boolean z, serializePolymorphic serializepolymorphic, Handler handler, modifyMapLikeSerializer modifymaplikeserializer, ArrayList<buildIndexedListSerializer> arrayList) {
        int i2;
        int i3;
        arrayList.add(new addAndResolveNonTypedSerializer(context, AudioAttributesCompatParcelizer(), serializefilteredanyproperties, z, handler, modifymaplikeserializer, serializepolymorphic));
        if (i != 0) {
            int size = arrayList.size();
            if (i == 2) {
                size--;
            }
            try {
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (buildIndexedListSerializer) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                        prune.write("DefaultRenderersFactory", "Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i2;
                        i2 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                }
                try {
                    try {
                        int i4 = i2 + 1;
                        try {
                            arrayList.add(i2, (buildIndexedListSerializer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, modifyMapLikeSerializer.class, serializePolymorphic.class).newInstance(handler, modifymaplikeserializer, serializepolymorphic));
                            prune.write("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused3) {
                        }
                        i2 = i4;
                    } catch (ClassNotFoundException unused4) {
                    }
                    try {
                        try {
                            i3 = i2 + 1;
                            try {
                                arrayList.add(i2, (buildIndexedListSerializer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, modifyMapLikeSerializer.class, serializePolymorphic.class).newInstance(handler, modifymaplikeserializer, serializepolymorphic));
                                prune.write("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused5) {
                                i2 = i3;
                                i3 = i2;
                            }
                        } catch (ClassNotFoundException unused6) {
                        }
                        try {
                            arrayList.add(i3, (buildIndexedListSerializer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, modifyMapLikeSerializer.class, serializePolymorphic.class).newInstance(handler, modifymaplikeserializer, serializepolymorphic));
                            prune.write("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused7) {
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating FFmpeg extension", e);
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating FLAC extension", e2);
                    }
                } catch (Exception e3) {
                    throw new RuntimeException("Error instantiating Opus extension", e3);
                }
            } catch (Exception e4) {
                throw new RuntimeException("Error instantiating MIDI extension", e4);
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(_hasNTypeParameters _hasntypeparameters, Looper looper, ArrayList<buildIndexedListSerializer> arrayList) {
        arrayList.add(new TypeBindings(_hasntypeparameters, looper));
    }

    private static void IconCompatParcelizer(valueToString valuetostring, Looper looper, ArrayList<buildIndexedListSerializer> arrayList) {
        arrayList.add(new NumberSerializerBigDecimalAsStringSerializer(valuetostring, looper));
    }

    private static void RemoteActionCompatParcelizer(ArrayList<buildIndexedListSerializer> arrayList) {
        arrayList.add(new _constructArray());
    }

    private static void read(ArrayList<buildIndexedListSerializer> arrayList) {
        arrayList.add(new IterableSerializer(FileSerializer.read.AudioAttributesCompatParcelizer));
    }

    private static serializePolymorphic IconCompatParcelizer(Context context, boolean z, boolean z2) {
        return new PropertyBuilder.AudioAttributesCompatParcelizer(context).IconCompatParcelizer(false).AudioAttributesCompatParcelizer(false).RemoteActionCompatParcelizer();
    }

    private _ensureOverride.IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
