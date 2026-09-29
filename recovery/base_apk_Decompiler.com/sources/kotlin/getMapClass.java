package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.JdkDeserializers;

/* JADX INFO: loaded from: classes2.dex */
public final class getMapClass extends NumberDeserializersBigDecimalDeserializer {
    private int RemoteActionCompatParcelizer;
    private ArrayList<NumberDeserializersBigDecimalDeserializer> read;

    public getMapClass(JdkDeserializers jdkDeserializers, int i) {
        super(jdkDeserializers);
        this.read = new ArrayList<>();
        this.MediaMetadataCompat = i;
        AudioAttributesImplApi21Parcelizer();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.MediaMetadataCompat == 0 ? "horizontal : " : "vertical : ");
        for (NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer : this.read) {
            sb.append("<");
            sb.append(numberDeserializersBigDecimalDeserializer);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final boolean MediaBrowserCompatItemReceiver() {
        int size = this.read.size();
        for (int i = 0; i < size; i++) {
            if (!this.read.get(i).MediaBrowserCompatItemReceiver()) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    public final long IconCompatParcelizer() {
        int size = this.read.size();
        long jIconCompatParcelizer = 0;
        for (int i = 0; i < size; i++) {
            NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = this.read.get(i);
            jIconCompatParcelizer = jIconCompatParcelizer + ((long) numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem.read) + numberDeserializersBigDecimalDeserializer.IconCompatParcelizer() + ((long) numberDeserializersBigDecimalDeserializer.write.read);
        }
        return jIconCompatParcelizer;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        JdkDeserializers jdkDeserializers;
        JdkDeserializers jdkDeserializers2 = this.MediaBrowserCompatItemReceiver;
        JdkDeserializers jdkDeserializersAudioAttributesImplApi26Parcelizer = jdkDeserializers2.AudioAttributesImplApi26Parcelizer(this.MediaMetadataCompat);
        while (true) {
            JdkDeserializers jdkDeserializers3 = jdkDeserializersAudioAttributesImplApi26Parcelizer;
            jdkDeserializers = jdkDeserializers2;
            jdkDeserializers2 = jdkDeserializers3;
            if (jdkDeserializers2 == null) {
                break;
            } else {
                jdkDeserializersAudioAttributesImplApi26Parcelizer = jdkDeserializers2.AudioAttributesImplApi26Parcelizer(this.MediaMetadataCompat);
            }
        }
        this.MediaBrowserCompatItemReceiver = jdkDeserializers;
        this.read.add(jdkDeserializers.AudioAttributesImplApi21Parcelizer(this.MediaMetadataCompat));
        JdkDeserializers jdkDeserializersMediaBrowserCompatCustomActionResultReceiver = jdkDeserializers.MediaBrowserCompatCustomActionResultReceiver(this.MediaMetadataCompat);
        while (jdkDeserializersMediaBrowserCompatCustomActionResultReceiver != null) {
            this.read.add(jdkDeserializersMediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer(this.MediaMetadataCompat));
            jdkDeserializersMediaBrowserCompatCustomActionResultReceiver = jdkDeserializersMediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(this.MediaMetadataCompat);
        }
        for (NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer : this.read) {
            if (this.MediaMetadataCompat == 0) {
                numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver.IconCompatParcelizer = this;
            } else if (this.MediaMetadataCompat == 1) {
                numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver.onSetShuffleMode = this;
            }
        }
        if (this.MediaMetadataCompat == 0 && ((_long) this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId())._init_lambda5() && this.read.size() > 1) {
            ArrayList<NumberDeserializersBigDecimalDeserializer> arrayList = this.read;
            this.MediaBrowserCompatItemReceiver = arrayList.get(arrayList.size() - 1).MediaBrowserCompatItemReceiver;
        }
        this.RemoteActionCompatParcelizer = this.MediaMetadataCompat == 0 ? this.MediaBrowserCompatItemReceiver.onCustomAction() : this.MediaBrowserCompatItemReceiver.onRemoveQueueItemAt();
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer = null;
        Iterator<NumberDeserializersBigDecimalDeserializer> it = this.read.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer = false;
        this.write.AudioAttributesImplBaseParcelizer = false;
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer, kotlin.MapDeserializerMapReferring
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f2;
        int i14;
        int i15;
        int i16;
        if (this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer && this.write.AudioAttributesImplBaseParcelizer) {
            JdkDeserializers jdkDeserializersOnPrepareFromMediaId = this.MediaBrowserCompatItemReceiver.onPrepareFromMediaId();
            boolean z_init_lambda5 = jdkDeserializersOnPrepareFromMediaId instanceof _long ? ((_long) jdkDeserializersOnPrepareFromMediaId)._init_lambda5() : false;
            int i17 = this.write.RatingCompat - this.MediaBrowserCompatMediaItem.RatingCompat;
            int size = this.read.size();
            int i18 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i18 >= size) {
                    i18 = -1;
                    break;
                } else if (this.read.get(i18).MediaBrowserCompatItemReceiver.onRewind() != 8) {
                    break;
                } else {
                    i18++;
                }
            }
            int i19 = size - 1;
            int i20 = i19;
            while (true) {
                if (i20 < 0) {
                    break;
                }
                if (this.read.get(i20).MediaBrowserCompatItemReceiver.onRewind() != 8) {
                    i = i20;
                    break;
                }
                i20--;
            }
            int i21 = 0;
            while (i21 < 2) {
                int i22 = 0;
                i4 = 0;
                i5 = 0;
                int i23 = 0;
                f = BitmapDescriptorFactory.HUE_RED;
                while (i22 < size) {
                    NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = this.read.get(i22);
                    if (numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver.onRewind() != i2) {
                        i23++;
                        if (i22 > 0 && i22 >= i18) {
                            i4 += numberDeserializersBigDecimalDeserializer.MediaBrowserCompatMediaItem.read;
                        }
                        int i24 = numberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.RatingCompat;
                        boolean z = numberDeserializersBigDecimalDeserializer.IconCompatParcelizer != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT;
                        if (z) {
                            if (this.MediaMetadataCompat == 0 && !numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver.MediaDescriptionCompat.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                                return;
                            }
                            if (this.MediaMetadataCompat == 1 && !numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver.onPrepareFromUri.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                                return;
                            }
                        } else {
                            if (numberDeserializersBigDecimalDeserializer.AudioAttributesImplBaseParcelizer == 1 && i21 == 0) {
                                i24 = numberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
                                i5++;
                            } else if (numberDeserializersBigDecimalDeserializer.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                            }
                            z = true;
                        }
                        if (z) {
                            i4 += i24;
                        } else {
                            i5++;
                            float f3 = numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver.onSetRating[this.MediaMetadataCompat];
                            if (f3 >= BitmapDescriptorFactory.HUE_RED) {
                                f += f3;
                            }
                        }
                        if (i22 < i19 && i22 < i) {
                            i4 -= numberDeserializersBigDecimalDeserializer.write.read;
                        }
                    }
                    i22++;
                    i2 = 8;
                }
                if (i4 < i17 || i5 == 0) {
                    i3 = i23;
                    break;
                } else {
                    i21++;
                    i2 = 8;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = BitmapDescriptorFactory.HUE_RED;
            int i25 = this.MediaBrowserCompatMediaItem.RatingCompat;
            if (z_init_lambda5) {
                i25 = this.write.RatingCompat;
            }
            if (i4 > i17) {
                int i26 = (int) (((i4 - i17) / 2.0f) + 0.5f);
                i25 = z_init_lambda5 ? i25 + i26 : i25 - i26;
            }
            if (i5 > 0) {
                float f4 = i17 - i4;
                int i27 = (int) ((f4 / i5) + 0.5f);
                int i28 = 0;
                int i29 = 0;
                while (i28 < size) {
                    NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer2 = this.read.get(i28);
                    int i30 = i27;
                    if (numberDeserializersBigDecimalDeserializer2.MediaBrowserCompatItemReceiver.onRewind() == 8 || numberDeserializersBigDecimalDeserializer2.IconCompatParcelizer != JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT || numberDeserializersBigDecimalDeserializer2.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer) {
                        i13 = i25;
                        f2 = f4;
                        i14 = i4;
                    } else {
                        int i31 = f > BitmapDescriptorFactory.HUE_RED ? (int) (((numberDeserializersBigDecimalDeserializer2.MediaBrowserCompatItemReceiver.onSetRating[this.MediaMetadataCompat] * f4) / f) + 0.5f) : i30;
                        if (this.MediaMetadataCompat == 0) {
                            i15 = numberDeserializersBigDecimalDeserializer2.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler;
                            f2 = f4;
                            i16 = numberDeserializersBigDecimalDeserializer2.MediaBrowserCompatItemReceiver.onPlayFromMediaId;
                        } else {
                            f2 = f4;
                            i15 = numberDeserializersBigDecimalDeserializer2.MediaBrowserCompatItemReceiver.onCustomAction;
                            i16 = numberDeserializersBigDecimalDeserializer2.MediaBrowserCompatItemReceiver.onPause;
                        }
                        i14 = i4;
                        i13 = i25;
                        int iMax = Math.max(i16, numberDeserializersBigDecimalDeserializer2.AudioAttributesImplBaseParcelizer == 1 ? Math.min(i31, numberDeserializersBigDecimalDeserializer2.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem) : i31);
                        if (i15 > 0) {
                            iMax = Math.min(i15, iMax);
                        }
                        if (iMax != i31) {
                            i29++;
                            i31 = iMax;
                        }
                        numberDeserializersBigDecimalDeserializer2.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i31);
                    }
                    i28++;
                    i27 = i30;
                    f4 = f2;
                    i4 = i14;
                    i25 = i13;
                }
                i6 = i25;
                int i32 = i4;
                if (i29 > 0) {
                    i5 -= i29;
                    int i33 = 0;
                    for (int i34 = 0; i34 < size; i34++) {
                        NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer3 = this.read.get(i34);
                        if (numberDeserializersBigDecimalDeserializer3.MediaBrowserCompatItemReceiver.onRewind() != 8) {
                            if (i34 > 0 && i34 >= i18) {
                                i33 += numberDeserializersBigDecimalDeserializer3.MediaBrowserCompatMediaItem.read;
                            }
                            i33 += numberDeserializersBigDecimalDeserializer3.AudioAttributesCompatParcelizer.RatingCompat;
                            if (i34 < i19 && i34 < i) {
                                i33 -= numberDeserializersBigDecimalDeserializer3.write.read;
                            }
                        }
                    }
                    i4 = i33;
                } else {
                    i4 = i32;
                }
                i8 = 2;
                if (this.RemoteActionCompatParcelizer == 2 && i29 == 0) {
                    i7 = 0;
                    this.RemoteActionCompatParcelizer = 0;
                } else {
                    i7 = 0;
                }
            } else {
                i6 = i25;
                i7 = 0;
                i8 = 2;
            }
            if (i4 > i17) {
                this.RemoteActionCompatParcelizer = i8;
            }
            if (i3 > 0 && i5 == 0 && i18 == i) {
                this.RemoteActionCompatParcelizer = i8;
            }
            int i35 = this.RemoteActionCompatParcelizer;
            if (i35 == 1) {
                if (i3 > 1) {
                    i11 = (i17 - i4) / (i3 - 1);
                } else {
                    i11 = i3 == 1 ? (i17 - i4) / 2 : i7;
                }
                if (i5 > 0) {
                    i11 = i7;
                }
                int i36 = i6;
                for (int i37 = i7; i37 < size; i37++) {
                    NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer4 = this.read.get(z_init_lambda5 ? size - (i37 + 1) : i37);
                    if (numberDeserializersBigDecimalDeserializer4.MediaBrowserCompatItemReceiver.onRewind() == 8) {
                        numberDeserializersBigDecimalDeserializer4.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i36);
                        numberDeserializersBigDecimalDeserializer4.write.RemoteActionCompatParcelizer(i36);
                    } else {
                        if (i37 > 0) {
                            i36 = z_init_lambda5 ? i36 - i11 : i36 + i11;
                        }
                        if (i37 > 0 && i37 >= i18) {
                            if (z_init_lambda5) {
                                i36 -= numberDeserializersBigDecimalDeserializer4.MediaBrowserCompatMediaItem.read;
                            } else {
                                i36 += numberDeserializersBigDecimalDeserializer4.MediaBrowserCompatMediaItem.read;
                            }
                        }
                        if (z_init_lambda5) {
                            numberDeserializersBigDecimalDeserializer4.write.RemoteActionCompatParcelizer(i36);
                        } else {
                            numberDeserializersBigDecimalDeserializer4.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i36);
                        }
                        int i38 = numberDeserializersBigDecimalDeserializer4.AudioAttributesCompatParcelizer.RatingCompat;
                        if (numberDeserializersBigDecimalDeserializer4.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && numberDeserializersBigDecimalDeserializer4.AudioAttributesImplBaseParcelizer == 1) {
                            i38 = numberDeserializersBigDecimalDeserializer4.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
                        }
                        i36 = z_init_lambda5 ? i36 - i38 : i36 + i38;
                        if (z_init_lambda5) {
                            numberDeserializersBigDecimalDeserializer4.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i36);
                        } else {
                            numberDeserializersBigDecimalDeserializer4.write.RemoteActionCompatParcelizer(i36);
                        }
                        numberDeserializersBigDecimalDeserializer4.AudioAttributesImplApi26Parcelizer = true;
                        if (i37 < i19 && i37 < i) {
                            if (z_init_lambda5) {
                                i12 = -numberDeserializersBigDecimalDeserializer4.write.read;
                            } else {
                                i12 = numberDeserializersBigDecimalDeserializer4.write.read;
                            }
                            i36 -= i12;
                        }
                    }
                }
                return;
            }
            if (i35 == 0) {
                int i39 = (i17 - i4) / (i3 + 1);
                if (i5 > 0) {
                    i39 = i7;
                }
                int i40 = i6;
                for (int i41 = i7; i41 < size; i41++) {
                    NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer5 = this.read.get(z_init_lambda5 ? size - (i41 + 1) : i41);
                    if (numberDeserializersBigDecimalDeserializer5.MediaBrowserCompatItemReceiver.onRewind() == 8) {
                        numberDeserializersBigDecimalDeserializer5.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i40);
                        numberDeserializersBigDecimalDeserializer5.write.RemoteActionCompatParcelizer(i40);
                    } else {
                        int i42 = z_init_lambda5 ? i40 - i39 : i40 + i39;
                        if (i41 > 0 && i41 >= i18) {
                            if (z_init_lambda5) {
                                i42 -= numberDeserializersBigDecimalDeserializer5.MediaBrowserCompatMediaItem.read;
                            } else {
                                i42 += numberDeserializersBigDecimalDeserializer5.MediaBrowserCompatMediaItem.read;
                            }
                        }
                        if (z_init_lambda5) {
                            numberDeserializersBigDecimalDeserializer5.write.RemoteActionCompatParcelizer(i42);
                        } else {
                            numberDeserializersBigDecimalDeserializer5.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i42);
                        }
                        int iMin = numberDeserializersBigDecimalDeserializer5.AudioAttributesCompatParcelizer.RatingCompat;
                        if (numberDeserializersBigDecimalDeserializer5.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && numberDeserializersBigDecimalDeserializer5.AudioAttributesImplBaseParcelizer == 1) {
                            iMin = Math.min(iMin, numberDeserializersBigDecimalDeserializer5.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem);
                        }
                        i40 = z_init_lambda5 ? i42 - iMin : i42 + iMin;
                        if (z_init_lambda5) {
                            numberDeserializersBigDecimalDeserializer5.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i40);
                        } else {
                            numberDeserializersBigDecimalDeserializer5.write.RemoteActionCompatParcelizer(i40);
                        }
                        if (i41 < i19 && i41 < i) {
                            if (z_init_lambda5) {
                                i10 = -numberDeserializersBigDecimalDeserializer5.write.read;
                            } else {
                                i10 = numberDeserializersBigDecimalDeserializer5.write.read;
                            }
                            i40 -= i10;
                        }
                    }
                }
                return;
            }
            if (i35 == 2) {
                float fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaMetadataCompat == 0 ? this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : this.MediaBrowserCompatItemReceiver.onRemoveQueueItem();
                if (z_init_lambda5) {
                    fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1.0f - fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                int i43 = (int) (((i17 - i4) * fMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) + 0.5f);
                if (i43 < 0 || i5 > 0) {
                    i43 = i7;
                }
                int i44 = z_init_lambda5 ? i6 - i43 : i6 + i43;
                for (int i45 = i7; i45 < size; i45++) {
                    NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer6 = this.read.get(z_init_lambda5 ? size - (i45 + 1) : i45);
                    if (numberDeserializersBigDecimalDeserializer6.MediaBrowserCompatItemReceiver.onRewind() == 8) {
                        numberDeserializersBigDecimalDeserializer6.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i44);
                        numberDeserializersBigDecimalDeserializer6.write.RemoteActionCompatParcelizer(i44);
                    } else {
                        if (i45 > 0 && i45 >= i18) {
                            if (z_init_lambda5) {
                                i44 -= numberDeserializersBigDecimalDeserializer6.MediaBrowserCompatMediaItem.read;
                            } else {
                                i44 += numberDeserializersBigDecimalDeserializer6.MediaBrowserCompatMediaItem.read;
                            }
                        }
                        if (z_init_lambda5) {
                            numberDeserializersBigDecimalDeserializer6.write.RemoteActionCompatParcelizer(i44);
                        } else {
                            numberDeserializersBigDecimalDeserializer6.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i44);
                        }
                        int i46 = numberDeserializersBigDecimalDeserializer6.AudioAttributesCompatParcelizer.RatingCompat;
                        if (numberDeserializersBigDecimalDeserializer6.IconCompatParcelizer == JdkDeserializers.IconCompatParcelizer.MATCH_CONSTRAINT && numberDeserializersBigDecimalDeserializer6.AudioAttributesImplBaseParcelizer == 1) {
                            i46 = numberDeserializersBigDecimalDeserializer6.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
                        }
                        i44 = z_init_lambda5 ? i44 - i46 : i44 + i46;
                        if (z_init_lambda5) {
                            numberDeserializersBigDecimalDeserializer6.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i44);
                        } else {
                            numberDeserializersBigDecimalDeserializer6.write.RemoteActionCompatParcelizer(i44);
                        }
                        if (i45 < i19 && i45 < i) {
                            if (z_init_lambda5) {
                                i9 = -numberDeserializersBigDecimalDeserializer6.write.read;
                            } else {
                                i9 = numberDeserializersBigDecimalDeserializer6.write.read;
                            }
                            i44 -= i9;
                        }
                    }
                }
            }
        }
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    public final void write() {
        for (int i = 0; i < this.read.size(); i++) {
            this.read.get(i).write();
        }
    }

    private JdkDeserializers AudioAttributesImplBaseParcelizer() {
        for (int i = 0; i < this.read.size(); i++) {
            NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = this.read.get(i);
            if (numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver.onRewind() != 8) {
                return numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver;
            }
        }
        return null;
    }

    private JdkDeserializers MediaBrowserCompatMediaItem() {
        for (int size = this.read.size() - 1; size >= 0; size--) {
            NumberDeserializersBigDecimalDeserializer numberDeserializersBigDecimalDeserializer = this.read.get(size);
            if (numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver.onRewind() != 8) {
                return numberDeserializersBigDecimalDeserializer.MediaBrowserCompatItemReceiver;
            }
        }
        return null;
    }

    @Override // kotlin.NumberDeserializersBigDecimalDeserializer
    final void read() {
        Iterator<NumberDeserializersBigDecimalDeserializer> it = this.read.iterator();
        while (it.hasNext()) {
            it.next().read();
        }
        int size = this.read.size();
        if (size <= 0) {
            return;
        }
        JdkDeserializers jdkDeserializers = this.read.get(0).MediaBrowserCompatItemReceiver;
        JdkDeserializers jdkDeserializers2 = this.read.get(size - 1).MediaBrowserCompatItemReceiver;
        if (this.MediaMetadataCompat == 0) {
            _int _intVar = jdkDeserializers.MediaMetadataCompat;
            _int _intVar2 = jdkDeserializers2.onPrepareFromMediaId;
            setIncludableProperties setincludablepropertiesRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(_intVar, 0);
            int iWrite = _intVar.write();
            JdkDeserializers jdkDeserializersAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            if (jdkDeserializersAudioAttributesImplBaseParcelizer != null) {
                iWrite = jdkDeserializersAudioAttributesImplBaseParcelizer.MediaMetadataCompat.write();
            }
            if (setincludablepropertiesRemoteActionCompatParcelizer != null) {
                read(this.MediaBrowserCompatMediaItem, setincludablepropertiesRemoteActionCompatParcelizer, iWrite);
            }
            setIncludableProperties setincludablepropertiesRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(_intVar2, 0);
            int iWrite2 = _intVar2.write();
            JdkDeserializers jdkDeserializersMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
            if (jdkDeserializersMediaBrowserCompatMediaItem != null) {
                iWrite2 = jdkDeserializersMediaBrowserCompatMediaItem.onPrepareFromMediaId.write();
            }
            if (setincludablepropertiesRemoteActionCompatParcelizer2 != null) {
                read(this.write, setincludablepropertiesRemoteActionCompatParcelizer2, -iWrite2);
            }
        } else {
            _int _intVar3 = jdkDeserializers.onSeekTo;
            _int _intVar4 = jdkDeserializers2.AudioAttributesImplApi26Parcelizer;
            setIncludableProperties setincludablepropertiesRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(_intVar3, 1);
            int iWrite3 = _intVar3.write();
            JdkDeserializers jdkDeserializersAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer();
            if (jdkDeserializersAudioAttributesImplBaseParcelizer2 != null) {
                iWrite3 = jdkDeserializersAudioAttributesImplBaseParcelizer2.onSeekTo.write();
            }
            if (setincludablepropertiesRemoteActionCompatParcelizer3 != null) {
                read(this.MediaBrowserCompatMediaItem, setincludablepropertiesRemoteActionCompatParcelizer3, iWrite3);
            }
            setIncludableProperties setincludablepropertiesRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(_intVar4, 1);
            int iWrite4 = _intVar4.write();
            JdkDeserializers jdkDeserializersMediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem();
            if (jdkDeserializersMediaBrowserCompatMediaItem2 != null) {
                iWrite4 = jdkDeserializersMediaBrowserCompatMediaItem2.AudioAttributesImplApi26Parcelizer.write();
            }
            if (setincludablepropertiesRemoteActionCompatParcelizer4 != null) {
                read(this.write, setincludablepropertiesRemoteActionCompatParcelizer4, -iWrite4);
            }
        }
        this.MediaBrowserCompatMediaItem.MediaBrowserCompatSearchResultReceiver = this;
        this.write.MediaBrowserCompatSearchResultReceiver = this;
    }
}
