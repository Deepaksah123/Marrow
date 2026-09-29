package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    private final int AudioAttributesCompatParcelizer;
    private Object RemoteActionCompatParcelizer;
    private final float read;

    RatingCompat(int i, float f) {
        this.AudioAttributesCompatParcelizer = i;
        this.read = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(" rating=");
        float f = this.read;
        sb.append(f < BitmapDescriptorFactory.HUE_RED ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.AudioAttributesCompatParcelizer);
        parcel.writeFloat(this.read);
    }

    public static RatingCompat AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public static RatingCompat RemoteActionCompatParcelizer(boolean z) {
        return new RatingCompat(1, z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }

    public static RatingCompat IconCompatParcelizer(boolean z) {
        return new RatingCompat(2, z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }

    public static RatingCompat read(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else {
            if (i != 5) {
                return null;
            }
            f2 = 5.0f;
        }
        if (f < BitmapDescriptorFactory.HUE_RED || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }

    public static RatingCompat RemoteActionCompatParcelizer(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f);
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.read >= BitmapDescriptorFactory.HUE_RED;
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer == 1 && this.read == 1.0f;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer == 2 && this.read == 1.0f;
    }

    public final float RemoteActionCompatParcelizer() {
        int i = this.AudioAttributesCompatParcelizer;
        if ((i == 3 || i == 4 || i == 5) && MediaBrowserCompatItemReceiver()) {
            return this.read;
        }
        return -1.0f;
    }

    public final float IconCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == 6 && MediaBrowserCompatItemReceiver()) {
            return this.read;
        }
        return -1.0f;
    }

    public static RatingCompat AudioAttributesCompatParcelizer(Object obj) {
        RatingCompat ratingCompatAudioAttributesCompatParcelizer = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iAudioAttributesCompatParcelizer = write.AudioAttributesCompatParcelizer(rating);
            if (write.write(rating)) {
                switch (iAudioAttributesCompatParcelizer) {
                    case 1:
                        ratingCompatAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(write.read(rating));
                        break;
                    case 2:
                        ratingCompatAudioAttributesCompatParcelizer = IconCompatParcelizer(write.AudioAttributesImplApi21Parcelizer(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompatAudioAttributesCompatParcelizer = read(iAudioAttributesCompatParcelizer, write.RemoteActionCompatParcelizer(rating));
                        break;
                    case 6:
                        ratingCompatAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(write.IconCompatParcelizer(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompatAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
            }
            ratingCompatAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = obj;
        }
        return ratingCompatAudioAttributesCompatParcelizer;
    }

    public final Object read() {
        if (this.RemoteActionCompatParcelizer == null) {
            if (MediaBrowserCompatItemReceiver()) {
                int i = this.AudioAttributesCompatParcelizer;
                switch (i) {
                    case 1:
                        this.RemoteActionCompatParcelizer = write.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer());
                        break;
                    case 2:
                        this.RemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.RemoteActionCompatParcelizer = write.AudioAttributesCompatParcelizer(i, RemoteActionCompatParcelizer());
                        break;
                    case 6:
                        this.RemoteActionCompatParcelizer = write.write(IconCompatParcelizer());
                        break;
                    default:
                        return null;
                }
            } else {
                this.RemoteActionCompatParcelizer = write.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    static class write {
        static int AudioAttributesCompatParcelizer(Rating rating) {
            return rating.getRatingStyle();
        }

        static boolean write(Rating rating) {
            return rating.isRated();
        }

        static boolean read(Rating rating) {
            return rating.hasHeart();
        }

        static boolean AudioAttributesImplApi21Parcelizer(Rating rating) {
            return rating.isThumbUp();
        }

        static float RemoteActionCompatParcelizer(Rating rating) {
            return rating.getStarRating();
        }

        static float IconCompatParcelizer(Rating rating) {
            return rating.getPercentRating();
        }

        static Rating AudioAttributesCompatParcelizer(boolean z) {
            return Rating.newHeartRating(z);
        }

        static Rating RemoteActionCompatParcelizer(boolean z) {
            return Rating.newThumbRating(z);
        }

        static Rating AudioAttributesCompatParcelizer(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        static Rating write(float f) {
            return Rating.newPercentageRating(f);
        }

        static Rating AudioAttributesCompatParcelizer(int i) {
            return Rating.newUnratedRating(i);
        }
    }
}
