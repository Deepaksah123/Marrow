package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u000b\u001a\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\f\u001a?\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/ApicFrame;", "p0", "Lo/PictureFrame;", "p1", "Lkotlin/Function3;", "", "p2", "Lo/getDisplayCutout;", "write", "(Lo/ApicFrame;Lo/PictureFrame;Lo/getModuleData;)Lo/getDisplayCutout;", "", "(Lo/ApicFrame;F)Z", "(Lo/ApicFrame;)F", "Lo/tryToResolveUnresolved;", "p3", "p4", "p5", "IconCompatParcelizer", "(Lo/ApicFrame;Lo/tryToResolveUnresolved;FFFF)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class consumeStableInsets {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000e\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0011"}, d2 = {"Lo/consumeStableInsets$AudioAttributesCompatParcelizer;", "Lo/getDisplayCutout;", "", "", "read", "(F)Z", "p0", "RemoteActionCompatParcelizer", "(F)F", "p1", "write", "(FF)F", "Lo/getInsetsIgnoringVisibility;", "Lo/getSubscriptionExpiresOn;", "IconCompatParcelizer", "(Lo/getInsetsIgnoringVisibility;F)Lo/getSubscriptionExpiresOn;", "Lo/addDrmEventListener;", "()Lo/addDrmEventListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements getDisplayCutout {
        final /* synthetic */ getModuleData<Float, Float, Float, Float> RemoteActionCompatParcelizer;
        final /* synthetic */ ApicFrame read;
        final /* synthetic */ PictureFrame write;

        public final boolean read(float f) {
            return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AudioAttributesCompatParcelizer(ApicFrame apicFrame, getModuleData<? super Float, ? super Float, ? super Float, Float> getmoduledata, PictureFrame pictureFrame) {
            this.read = apicFrame;
            this.RemoteActionCompatParcelizer = getmoduledata;
            this.write = pictureFrame;
        }

        public final addDrmEventListener write() {
            return this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        @Override // kotlin.getDisplayCutout
        public final float RemoteActionCompatParcelizer(float p0) {
            Pair<Float, Float> pairIconCompatParcelizer = IconCompatParcelizer(this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getRatingCompat(), p0);
            float fFloatValue = pairIconCompatParcelizer.RemoteActionCompatParcelizer().floatValue();
            float fFloatValue2 = pairIconCompatParcelizer.read().floatValue();
            float fFloatValue3 = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(Float.valueOf(p0), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
            if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != BitmapDescriptorFactory.HUE_RED) {
                StringBuilder sb = new StringBuilder("Final Snapping Offset Should Be one of ");
                sb.append(fFloatValue);
                sb.append(", ");
                sb.append(fFloatValue2);
                sb.append(" or 0.0");
                getRootStableInsets.AudioAttributesCompatParcelizer(sb.toString());
            }
            return read(fFloatValue3) ? fFloatValue3 : BitmapDescriptorFactory.HUE_RED;
        }

        @Override // kotlin.getDisplayCutout
        public final float write(float p0, float p1) {
            int audioAttributesImplBaseParcelizer;
            int iOnFastForward = this.read.onFastForward() + this.read.onMediaButtonEvent();
            if (iOnFastForward == 0) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (p0 < BitmapDescriptorFactory.HUE_RED) {
                audioAttributesImplBaseParcelizer = this.read.getAudioAttributesImplBaseParcelizer() + 1;
            } else {
                audioAttributesImplBaseParcelizer = this.read.getAudioAttributesImplBaseParcelizer();
            }
            int iWrite = getQues.write(Math.abs((getQues.write(this.write.IconCompatParcelizer(audioAttributesImplBaseParcelizer, getQues.write(((int) (p1 / iOnFastForward)) + audioAttributesImplBaseParcelizer, 0, this.read.write()), p0, this.read.onFastForward(), this.read.onMediaButtonEvent()), 0, this.read.write()) - audioAttributesImplBaseParcelizer) * iOnFastForward) - iOnFastForward, 0);
            return iWrite == 0 ? iWrite : iWrite * Math.signum(p0);
        }

        private final Pair<Float, Float> IconCompatParcelizer(getInsetsIgnoringVisibility p0, float p1) {
            float f;
            List<createPeriod> listRatingCompat = write().RatingCompat();
            ApicFrame apicFrame = this.read;
            int size = listRatingCompat.size();
            int i = 0;
            float f2 = Float.NEGATIVE_INFINITY;
            float f3 = Float.POSITIVE_INFINITY;
            while (true) {
                f = BitmapDescriptorFactory.HUE_RED;
                if (i >= size) {
                    break;
                }
                createPeriod createperiod = listRatingCompat.get(i);
                float fIconCompatParcelizer = getStableInsets.IconCompatParcelizer(enableInternal.AudioAttributesCompatParcelizer(write()), write().read(), write().getRead(), write().getAudioAttributesCompatParcelizer(), createperiod.getMediaBrowserCompatMediaItem(), createperiod.getWrite(), p0, apicFrame.write());
                if (fIconCompatParcelizer <= BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer > f2) {
                    f2 = fIconCompatParcelizer;
                }
                if (fIconCompatParcelizer >= BitmapDescriptorFactory.HUE_RED && fIconCompatParcelizer < f3) {
                    f3 = fIconCompatParcelizer;
                }
                i++;
            }
            if (f2 == Float.NEGATIVE_INFINITY) {
                f2 = f3;
            }
            if (f3 == Float.POSITIVE_INFINITY) {
                f3 = f2;
            }
            if (!this.read.AudioAttributesCompatParcelizer()) {
                if (consumeStableInsets.write(this.read, p1)) {
                    f2 = 0.0f;
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                }
            }
            if (this.read.read()) {
                f = f2;
            } else if (!consumeStableInsets.write(this.read, p1)) {
                f3 = 0.0f;
            }
            return setAction.write(Float.valueOf(f), Float.valueOf(f3));
        }
    }

    public static final getDisplayCutout write(ApicFrame apicFrame, PictureFrame pictureFrame, getModuleData<? super Float, ? super Float, ? super Float, Float> getmoduledata) {
        return new AudioAttributesCompatParcelizer(apicFrame, getmoduledata, pictureFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(ApicFrame apicFrame, float f) {
        boolean audioAttributesImplBaseParcelizer = apicFrame.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getAudioAttributesImplBaseParcelizer();
        boolean z = (apicFrame.onSeekTo() ? -f : write(apicFrame)) > BitmapDescriptorFactory.HUE_RED;
        return (z && audioAttributesImplBaseParcelizer) || !(z || audioAttributesImplBaseParcelizer);
    }

    private static final float write(ApicFrame apicFrame) {
        if (apicFrame.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getIconCompatParcelizer() == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            return Float.intBitsToFloat((int) (apicFrame.onRewind() >> 32));
        }
        return Float.intBitsToFloat((int) apicFrame.onRewind());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float IconCompatParcelizer(kotlin.ApicFrame r4, kotlin.tryToResolveUnresolved r5, float r6, float r7, float r8, float r9) {
        /*
            boolean r0 = write(r4, r7)
            o.addDrmEventListener r1 = r4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            o.superDispatchKeyEvent r1 = r1.getIconCompatParcelizer()
            o.superDispatchKeyEvent r2 = kotlin.superDispatchKeyEvent.write
            if (r1 == r2) goto L19
            o.tryToResolveUnresolved r1 = kotlin.tryToResolveUnresolved.write
            if (r5 == r1) goto L19
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            o.addDrmEventListener r5 = r4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            int r5 = r5.getAudioAttributesCompatParcelizer()
            r1 = 0
            if (r5 != 0) goto L26
            r2 = r1
            goto L2c
        L26:
            float r2 = write(r4)
            float r5 = (float) r5
            float r2 = r2 / r5
        L2c:
            int r5 = (int) r2
            float r5 = (float) r5
            o.bufferMapProperty r3 = r4.getOnPlayFromMediaId()
            int r7 = kotlin.copyRootViewBounds.write(r3, r7)
            o.sendAccessibilityEvent$AudioAttributesCompatParcelizer r3 = kotlin.sendAccessibilityEvent.INSTANCE
            int r3 = r3.write()
            boolean r3 = kotlin.sendAccessibilityEvent.IconCompatParcelizer(r7, r3)
            if (r3 == 0) goto L6f
            float r5 = r2 - r5
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L4f
            if (r0 == 0) goto L88
            goto L7b
        L4f:
            float r5 = java.lang.Math.abs(r2)
            float r4 = r4.onPrepareFromMediaId()
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 < 0) goto L62
            if (r0 == 0) goto L7b
            goto L88
        L62:
            float r4 = java.lang.Math.abs(r8)
            float r5 = java.lang.Math.abs(r9)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L7b
            goto L88
        L6f:
            o.sendAccessibilityEvent$AudioAttributesCompatParcelizer r4 = kotlin.sendAccessibilityEvent.INSTANCE
            int r4 = r4.IconCompatParcelizer()
            boolean r4 = kotlin.sendAccessibilityEvent.IconCompatParcelizer(r7, r4)
            if (r4 == 0) goto L7c
        L7b:
            return r9
        L7c:
            o.sendAccessibilityEvent$AudioAttributesCompatParcelizer r4 = kotlin.sendAccessibilityEvent.INSTANCE
            int r4 = r4.AudioAttributesCompatParcelizer()
            boolean r4 = kotlin.sendAccessibilityEvent.IconCompatParcelizer(r7, r4)
            if (r4 == 0) goto L89
        L88:
            return r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.consumeStableInsets.IconCompatParcelizer(o.ApicFrame, o.tryToResolveUnresolved, float, float, float, float):float");
    }
}
