package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumSetDeserializer extends _deserializeUsingProperties {
    private final double[] IconCompatParcelizer;
    private AudioAttributesCompatParcelizer[] RemoteActionCompatParcelizer;
    private boolean write = true;

    @Override // kotlin._deserializeUsingProperties
    public final void read(double d, double[] dArr) {
        if (!this.write) {
            if (d < this.RemoteActionCompatParcelizer[0].write) {
                d = this.RemoteActionCompatParcelizer[0].write;
            }
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = this.RemoteActionCompatParcelizer;
            if (d > audioAttributesCompatParcelizerArr[audioAttributesCompatParcelizerArr.length - 1].RemoteActionCompatParcelizer) {
                AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr2 = this.RemoteActionCompatParcelizer;
                d = audioAttributesCompatParcelizerArr2[audioAttributesCompatParcelizerArr2.length - 1].RemoteActionCompatParcelizer;
            }
        } else {
            if (d < this.RemoteActionCompatParcelizer[0].write) {
                double d2 = this.RemoteActionCompatParcelizer[0].write;
                double d3 = d - this.RemoteActionCompatParcelizer[0].write;
                if (this.RemoteActionCompatParcelizer[0].IconCompatParcelizer) {
                    dArr[0] = this.RemoteActionCompatParcelizer[0].write(d2) + (this.RemoteActionCompatParcelizer[0].read() * d3);
                    dArr[1] = this.RemoteActionCompatParcelizer[0].IconCompatParcelizer(d2) + (d3 * this.RemoteActionCompatParcelizer[0].write());
                    return;
                } else {
                    this.RemoteActionCompatParcelizer[0].RemoteActionCompatParcelizer(d2);
                    dArr[0] = this.RemoteActionCompatParcelizer[0].RemoteActionCompatParcelizer() + (this.RemoteActionCompatParcelizer[0].AudioAttributesCompatParcelizer() * d3);
                    dArr[1] = this.RemoteActionCompatParcelizer[0].MediaBrowserCompatCustomActionResultReceiver() + (d3 * this.RemoteActionCompatParcelizer[0].IconCompatParcelizer());
                    return;
                }
            }
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr3 = this.RemoteActionCompatParcelizer;
            if (d > audioAttributesCompatParcelizerArr3[audioAttributesCompatParcelizerArr3.length - 1].RemoteActionCompatParcelizer) {
                AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr4 = this.RemoteActionCompatParcelizer;
                double d4 = audioAttributesCompatParcelizerArr4[audioAttributesCompatParcelizerArr4.length - 1].RemoteActionCompatParcelizer;
                double d5 = d - d4;
                AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr5 = this.RemoteActionCompatParcelizer;
                int length = audioAttributesCompatParcelizerArr5.length - 1;
                if (audioAttributesCompatParcelizerArr5[length].IconCompatParcelizer) {
                    dArr[0] = this.RemoteActionCompatParcelizer[length].write(d4) + (this.RemoteActionCompatParcelizer[length].read() * d5);
                    dArr[1] = this.RemoteActionCompatParcelizer[length].IconCompatParcelizer(d4) + (d5 * this.RemoteActionCompatParcelizer[length].write());
                    return;
                } else {
                    this.RemoteActionCompatParcelizer[length].RemoteActionCompatParcelizer(d);
                    dArr[0] = this.RemoteActionCompatParcelizer[length].RemoteActionCompatParcelizer() + (this.RemoteActionCompatParcelizer[length].AudioAttributesCompatParcelizer() * d5);
                    dArr[1] = this.RemoteActionCompatParcelizer[length].MediaBrowserCompatCustomActionResultReceiver() + (d5 * this.RemoteActionCompatParcelizer[length].IconCompatParcelizer());
                    return;
                }
            }
        }
        int i = 0;
        while (true) {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr6 = this.RemoteActionCompatParcelizer;
            if (i >= audioAttributesCompatParcelizerArr6.length) {
                return;
            }
            if (d <= audioAttributesCompatParcelizerArr6[i].RemoteActionCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer[i].IconCompatParcelizer) {
                    dArr[0] = this.RemoteActionCompatParcelizer[i].write(d);
                    dArr[1] = this.RemoteActionCompatParcelizer[i].IconCompatParcelizer(d);
                    return;
                } else {
                    this.RemoteActionCompatParcelizer[i].RemoteActionCompatParcelizer(d);
                    dArr[0] = this.RemoteActionCompatParcelizer[i].RemoteActionCompatParcelizer();
                    dArr[1] = this.RemoteActionCompatParcelizer[i].MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
            }
            i++;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final void AudioAttributesCompatParcelizer(double d, float[] fArr) {
        if (this.write) {
            if (d < this.RemoteActionCompatParcelizer[0].write) {
                double d2 = this.RemoteActionCompatParcelizer[0].write;
                double d3 = d - this.RemoteActionCompatParcelizer[0].write;
                if (this.RemoteActionCompatParcelizer[0].IconCompatParcelizer) {
                    fArr[0] = (float) (this.RemoteActionCompatParcelizer[0].write(d2) + (this.RemoteActionCompatParcelizer[0].read() * d3));
                    fArr[1] = (float) (this.RemoteActionCompatParcelizer[0].IconCompatParcelizer(d2) + (d3 * this.RemoteActionCompatParcelizer[0].write()));
                    return;
                } else {
                    this.RemoteActionCompatParcelizer[0].RemoteActionCompatParcelizer(d2);
                    fArr[0] = (float) (this.RemoteActionCompatParcelizer[0].RemoteActionCompatParcelizer() + (this.RemoteActionCompatParcelizer[0].AudioAttributesCompatParcelizer() * d3));
                    fArr[1] = (float) (this.RemoteActionCompatParcelizer[0].MediaBrowserCompatCustomActionResultReceiver() + (d3 * this.RemoteActionCompatParcelizer[0].IconCompatParcelizer()));
                    return;
                }
            }
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = this.RemoteActionCompatParcelizer;
            if (d > audioAttributesCompatParcelizerArr[audioAttributesCompatParcelizerArr.length - 1].RemoteActionCompatParcelizer) {
                AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr2 = this.RemoteActionCompatParcelizer;
                double d4 = audioAttributesCompatParcelizerArr2[audioAttributesCompatParcelizerArr2.length - 1].RemoteActionCompatParcelizer;
                double d5 = d - d4;
                AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr3 = this.RemoteActionCompatParcelizer;
                int length = audioAttributesCompatParcelizerArr3.length - 1;
                if (audioAttributesCompatParcelizerArr3[length].IconCompatParcelizer) {
                    fArr[0] = (float) (this.RemoteActionCompatParcelizer[length].write(d4) + (this.RemoteActionCompatParcelizer[length].read() * d5));
                    fArr[1] = (float) (this.RemoteActionCompatParcelizer[length].IconCompatParcelizer(d4) + (d5 * this.RemoteActionCompatParcelizer[length].write()));
                    return;
                } else {
                    this.RemoteActionCompatParcelizer[length].RemoteActionCompatParcelizer(d);
                    fArr[0] = (float) this.RemoteActionCompatParcelizer[length].RemoteActionCompatParcelizer();
                    fArr[1] = (float) this.RemoteActionCompatParcelizer[length].MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
            }
        } else if (d < this.RemoteActionCompatParcelizer[0].write) {
            d = this.RemoteActionCompatParcelizer[0].write;
        } else {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr4 = this.RemoteActionCompatParcelizer;
            if (d > audioAttributesCompatParcelizerArr4[audioAttributesCompatParcelizerArr4.length - 1].RemoteActionCompatParcelizer) {
                AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr5 = this.RemoteActionCompatParcelizer;
                d = audioAttributesCompatParcelizerArr5[audioAttributesCompatParcelizerArr5.length - 1].RemoteActionCompatParcelizer;
            }
        }
        int i = 0;
        while (true) {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr6 = this.RemoteActionCompatParcelizer;
            if (i >= audioAttributesCompatParcelizerArr6.length) {
                return;
            }
            if (d <= audioAttributesCompatParcelizerArr6[i].RemoteActionCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer[i].IconCompatParcelizer) {
                    fArr[0] = (float) this.RemoteActionCompatParcelizer[i].write(d);
                    fArr[1] = (float) this.RemoteActionCompatParcelizer[i].IconCompatParcelizer(d);
                    return;
                } else {
                    this.RemoteActionCompatParcelizer[i].RemoteActionCompatParcelizer(d);
                    fArr[0] = (float) this.RemoteActionCompatParcelizer[i].RemoteActionCompatParcelizer();
                    fArr[1] = (float) this.RemoteActionCompatParcelizer[i].MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
            }
            i++;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final void AudioAttributesCompatParcelizer(double d, double[] dArr) {
        if (d < this.RemoteActionCompatParcelizer[0].write) {
            d = this.RemoteActionCompatParcelizer[0].write;
        } else {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = this.RemoteActionCompatParcelizer;
            if (d > audioAttributesCompatParcelizerArr[audioAttributesCompatParcelizerArr.length - 1].RemoteActionCompatParcelizer) {
                AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr2 = this.RemoteActionCompatParcelizer;
                d = audioAttributesCompatParcelizerArr2[audioAttributesCompatParcelizerArr2.length - 1].RemoteActionCompatParcelizer;
            }
        }
        int i = 0;
        while (true) {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr3 = this.RemoteActionCompatParcelizer;
            if (i >= audioAttributesCompatParcelizerArr3.length) {
                return;
            }
            if (d <= audioAttributesCompatParcelizerArr3[i].RemoteActionCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer[i].IconCompatParcelizer) {
                    dArr[0] = this.RemoteActionCompatParcelizer[i].read();
                    dArr[1] = this.RemoteActionCompatParcelizer[i].write();
                    return;
                } else {
                    this.RemoteActionCompatParcelizer[i].RemoteActionCompatParcelizer(d);
                    dArr[0] = this.RemoteActionCompatParcelizer[i].AudioAttributesCompatParcelizer();
                    dArr[1] = this.RemoteActionCompatParcelizer[i].IconCompatParcelizer();
                    return;
                }
            }
            i++;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final double RemoteActionCompatParcelizer(double d) {
        double d2;
        double dAudioAttributesCompatParcelizer;
        double dRemoteActionCompatParcelizer;
        int i = 0;
        if (this.write) {
            if (d < this.RemoteActionCompatParcelizer[0].write) {
                double d3 = this.RemoteActionCompatParcelizer[0].write;
                d2 = d - this.RemoteActionCompatParcelizer[0].write;
                if (this.RemoteActionCompatParcelizer[0].IconCompatParcelizer) {
                    dRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer[0].write(d3);
                    dAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer[0].read();
                } else {
                    this.RemoteActionCompatParcelizer[0].RemoteActionCompatParcelizer(d3);
                    dRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer[0].RemoteActionCompatParcelizer();
                    dAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer[0].AudioAttributesCompatParcelizer();
                }
            } else {
                if (d > this.RemoteActionCompatParcelizer[r0.length - 1].RemoteActionCompatParcelizer) {
                    double d4 = this.RemoteActionCompatParcelizer[r0.length - 1].RemoteActionCompatParcelizer;
                    d2 = d - d4;
                    AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = this.RemoteActionCompatParcelizer;
                    int length = audioAttributesCompatParcelizerArr.length - 1;
                    double dWrite = audioAttributesCompatParcelizerArr[length].write(d4);
                    dAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer[length].read();
                    dRemoteActionCompatParcelizer = dWrite;
                }
            }
            return dRemoteActionCompatParcelizer + (d2 * dAudioAttributesCompatParcelizer);
        }
        if (d < this.RemoteActionCompatParcelizer[0].write) {
            d = this.RemoteActionCompatParcelizer[0].write;
        } else {
            if (d > this.RemoteActionCompatParcelizer[r0.length - 1].RemoteActionCompatParcelizer) {
                d = this.RemoteActionCompatParcelizer[r9.length - 1].RemoteActionCompatParcelizer;
            }
        }
        while (true) {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr2 = this.RemoteActionCompatParcelizer;
            if (i >= audioAttributesCompatParcelizerArr2.length) {
                return Double.NaN;
            }
            if (d <= audioAttributesCompatParcelizerArr2[i].RemoteActionCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer[i].IconCompatParcelizer) {
                    return this.RemoteActionCompatParcelizer[i].write(d);
                }
                this.RemoteActionCompatParcelizer[i].RemoteActionCompatParcelizer(d);
                return this.RemoteActionCompatParcelizer[i].RemoteActionCompatParcelizer();
            }
            i++;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final double IconCompatParcelizer(double d, int i) {
        int i2 = 0;
        if (d < this.RemoteActionCompatParcelizer[0].write) {
            d = this.RemoteActionCompatParcelizer[0].write;
        }
        if (d > this.RemoteActionCompatParcelizer[r6.length - 1].RemoteActionCompatParcelizer) {
            d = this.RemoteActionCompatParcelizer[r4.length - 1].RemoteActionCompatParcelizer;
        }
        while (true) {
            AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr = this.RemoteActionCompatParcelizer;
            if (i2 >= audioAttributesCompatParcelizerArr.length) {
                return Double.NaN;
            }
            if (d <= audioAttributesCompatParcelizerArr[i2].RemoteActionCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer[i2].IconCompatParcelizer) {
                    return this.RemoteActionCompatParcelizer[i2].read();
                }
                this.RemoteActionCompatParcelizer[i2].RemoteActionCompatParcelizer(d);
                return this.RemoteActionCompatParcelizer[i2].AudioAttributesCompatParcelizer();
            }
            i2++;
        }
    }

    @Override // kotlin._deserializeUsingProperties
    public final double[] AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[PHI: r9
      0x0035: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:6:0x001e, B:12:0x0028, B:14:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EnumSetDeserializer(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.write = r2
            r0.IconCompatParcelizer = r1
            int r3 = r1.length
            int r3 = r3 - r2
            o.EnumSetDeserializer$AudioAttributesCompatParcelizer[] r3 = new o.EnumSetDeserializer.AudioAttributesCompatParcelizer[r3]
            r0.RemoteActionCompatParcelizer = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            o.EnumSetDeserializer$AudioAttributesCompatParcelizer[] r7 = r0.RemoteActionCompatParcelizer
            int r8 = r7.length
            if (r4 >= r8) goto L55
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L35
            if (r8 == r2) goto L32
            r10 = 2
            if (r8 == r10) goto L30
            if (r8 == r9) goto L2e
            r9 = 4
            if (r8 == r9) goto L35
            r9 = 5
            if (r8 == r9) goto L35
            goto L36
        L2e:
            if (r5 != r2) goto L32
        L30:
            r5 = r10
            goto L33
        L32:
            r5 = r2
        L33:
            r6 = r5
            goto L36
        L35:
            r6 = r9
        L36:
            r10 = r1[r4]
            int r22 = r4 + 1
            r12 = r1[r22]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r22]
            o.EnumSetDeserializer$AudioAttributesCompatParcelizer r23 = new o.EnumSetDeserializer$AudioAttributesCompatParcelizer
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r23
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r23
            r4 = r22
            goto L16
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.EnumSetDeserializer.<init>(int[], double[], double[][]):void");
    }

    static class AudioAttributesCompatParcelizer {
        private static double[] read = new double[91];
        private double AudioAttributesCompatParcelizer;
        private double AudioAttributesImplApi21Parcelizer;
        private double AudioAttributesImplApi26Parcelizer;
        private double AudioAttributesImplBaseParcelizer;
        boolean IconCompatParcelizer;
        private double MediaBrowserCompatCustomActionResultReceiver;
        private double MediaBrowserCompatItemReceiver;
        private double[] MediaBrowserCompatMediaItem;
        private double MediaBrowserCompatSearchResultReceiver;
        private double MediaDescriptionCompat;
        private double MediaMetadataCompat;
        private boolean RatingCompat;
        double RemoteActionCompatParcelizer;
        private double handleMediaPlayPauseIfPendingOnHandler;
        private double onAddQueueItem;
        private double onCommand;
        private double onCustomAction;
        double write;

        AudioAttributesCompatParcelizer(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.IconCompatParcelizer = false;
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (i == 1) {
                this.RatingCompat = true;
            } else if (i == 4) {
                this.RatingCompat = d8 > 0.0d;
            } else if (i == 5) {
                this.RatingCompat = d8 < 0.0d;
            } else {
                this.RatingCompat = false;
            }
            this.write = d;
            this.RemoteActionCompatParcelizer = d2;
            this.MediaMetadataCompat = 1.0d / (d2 - d);
            if (3 == i) {
                this.IconCompatParcelizer = true;
            }
            if (this.IconCompatParcelizer || Math.abs(d7) < 0.001d || Math.abs(d8) < 0.001d) {
                this.IconCompatParcelizer = true;
                this.onCustomAction = d3;
                this.onAddQueueItem = d5;
                this.onCommand = d4;
                this.handleMediaPlayPauseIfPendingOnHandler = d6;
                double dHypot = Math.hypot(d8, d7);
                this.AudioAttributesCompatParcelizer = dHypot;
                this.MediaBrowserCompatCustomActionResultReceiver = dHypot * this.MediaMetadataCompat;
                double d9 = this.RemoteActionCompatParcelizer - this.write;
                this.AudioAttributesImplBaseParcelizer = d7 / d9;
                this.MediaBrowserCompatItemReceiver = d8 / d9;
                return;
            }
            this.MediaBrowserCompatMediaItem = new double[101];
            boolean z = this.RatingCompat;
            this.AudioAttributesImplApi26Parcelizer = d7 * ((double) (z ? -1 : 1));
            this.AudioAttributesImplApi21Parcelizer = d8 * ((double) (z ? 1 : -1));
            this.AudioAttributesImplBaseParcelizer = z ? d5 : d3;
            this.MediaBrowserCompatItemReceiver = z ? d4 : d6;
            AudioAttributesCompatParcelizer(d3, d4, d5, d6);
            this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer * this.MediaMetadataCompat;
        }

        final void RemoteActionCompatParcelizer(double d) {
            double dAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((this.RatingCompat ? this.RemoteActionCompatParcelizer - d : d - this.write) * this.MediaMetadataCompat) * 1.5707963267948966d;
            this.MediaBrowserCompatSearchResultReceiver = Math.sin(dAudioAttributesCompatParcelizer);
            this.MediaDescriptionCompat = Math.cos(dAudioAttributesCompatParcelizer);
        }

        final double RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer + (this.AudioAttributesImplApi26Parcelizer * this.MediaBrowserCompatSearchResultReceiver);
        }

        final double MediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatItemReceiver + (this.AudioAttributesImplApi21Parcelizer * this.MediaDescriptionCompat);
        }

        final double AudioAttributesCompatParcelizer() {
            double d = this.AudioAttributesImplApi26Parcelizer * this.MediaDescriptionCompat;
            double dHypot = this.MediaBrowserCompatCustomActionResultReceiver / Math.hypot(d, (-this.AudioAttributesImplApi21Parcelizer) * this.MediaBrowserCompatSearchResultReceiver);
            return this.RatingCompat ? (-d) * dHypot : d * dHypot;
        }

        final double IconCompatParcelizer() {
            double d = this.AudioAttributesImplApi26Parcelizer;
            double d2 = this.MediaDescriptionCompat;
            double d3 = (-this.AudioAttributesImplApi21Parcelizer) * this.MediaBrowserCompatSearchResultReceiver;
            double dHypot = this.MediaBrowserCompatCustomActionResultReceiver / Math.hypot(d * d2, d3);
            return this.RatingCompat ? (-d3) * dHypot : d3 * dHypot;
        }

        public final double write(double d) {
            double d2 = this.write;
            double d3 = this.MediaMetadataCompat;
            double d4 = this.onCustomAction;
            return d4 + ((d - d2) * d3 * (this.onAddQueueItem - d4));
        }

        public final double IconCompatParcelizer(double d) {
            double d2 = this.write;
            double d3 = this.MediaMetadataCompat;
            double d4 = this.onCommand;
            return d4 + ((d - d2) * d3 * (this.handleMediaPlayPauseIfPendingOnHandler - d4));
        }

        public final double read() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final double write() {
            return this.MediaBrowserCompatItemReceiver;
        }

        private double AudioAttributesCompatParcelizer(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.MediaBrowserCompatMediaItem;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            double d2 = dArr[i];
            return d2 + ((length - ((double) i)) * (dArr[i + 1] - d2));
        }

        private void AudioAttributesCompatParcelizer(double d, double d2, double d3, double d4) {
            int i = 0;
            int i2 = 0;
            double dHypot = 0.0d;
            double d5 = 0.0d;
            double d6 = 0.0d;
            while (true) {
                if (i2 >= read.length) {
                    break;
                }
                double radians = Math.toRadians((((double) i2) * 90.0d) / ((double) (r11.length - 1)));
                double dSin = Math.sin(radians) * (d3 - d);
                double dCos = Math.cos(radians) * (d2 - d4);
                if (i2 > 0) {
                    dHypot += Math.hypot(dSin - d5, dCos - d6);
                    read[i2] = dHypot;
                }
                i2++;
                d6 = dCos;
                d5 = dSin;
            }
            this.AudioAttributesCompatParcelizer = dHypot;
            int i3 = 0;
            while (true) {
                double[] dArr = read;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] / dHypot;
                i3++;
            }
            while (true) {
                if (i >= this.MediaBrowserCompatMediaItem.length) {
                    return;
                }
                double length = ((double) i) / ((double) (r4.length - 1));
                int iBinarySearch = Arrays.binarySearch(read, length);
                if (iBinarySearch >= 0) {
                    this.MediaBrowserCompatMediaItem[i] = ((double) iBinarySearch) / ((double) (read.length - 1));
                } else if (iBinarySearch == -1) {
                    this.MediaBrowserCompatMediaItem[i] = 0.0d;
                } else {
                    int i4 = -iBinarySearch;
                    int i5 = i4 - 2;
                    double[] dArr2 = read;
                    double d7 = dArr2[i5];
                    this.MediaBrowserCompatMediaItem[i] = (((double) i5) + ((length - d7) / (dArr2[i4 - 1] - d7))) / ((double) (dArr2.length - 1));
                }
                i++;
            }
        }
    }
}
