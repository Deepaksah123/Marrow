###### Class android.support.v4.media.session.PlaybackStateCompat (android.support.v4.media.session.PlaybackStateCompat)
.class public final Landroid/support/v4/media/session/PlaybackStateCompat;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/PlaybackStateCompat$write;,
        Landroid/support/v4/media/session/PlaybackStateCompat$IconCompatParcelizer;,
        Landroid/support/v4/media/session/PlaybackStateCompat$read;,
        Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/session/PlaybackStateCompat;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final AudioAttributesCompatParcelizer:J

.field final AudioAttributesImplApi21Parcelizer:J

.field final AudioAttributesImplApi26Parcelizer:I

.field final AudioAttributesImplBaseParcelizer:F

.field final IconCompatParcelizer:J

.field final MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

.field final MediaBrowserCompatItemReceiver:Landroid/os/Bundle;

.field private MediaDescriptionCompat:Landroid/media/session/PlaybackState;

.field final RatingCompat:J

.field RemoteActionCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;",
            ">;"
        }
    .end annotation
.end field

.field final read:I

.field final write:J


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 868
    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat$5;

    invoke-direct {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$5;-><init>()V

    sput-object v0, Landroid/support/v4/media/session/PlaybackStateCompat;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJJFJILjava/lang/CharSequence;JLjava/util/List;JLandroid/os/Bundle;)V
    .registers 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJFJI",
            "Ljava/lang/CharSequence;",
            "J",
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;",
            ">;J",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    .line 561
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v1, p1

    .line 562
    iput v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi26Parcelizer:I

    move-wide v1, p2

    .line 563
    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi21Parcelizer:J

    move-wide v1, p4

    .line 564
    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->IconCompatParcelizer:J

    move v1, p6

    .line 565
    iput v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer:F

    move-wide v1, p7

    .line 566
    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesCompatParcelizer:J

    move v1, p9

    .line 567
    iput v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->read:I

    move-object v1, p10

    .line 568
    iput-object v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    move-wide v1, p11

    .line 569
    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->RatingCompat:J

    .line 570
    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v2, p13

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer:Ljava/util/List;

    move-wide/from16 v1, p14

    .line 571
    iput-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->write:J

    move-object/from16 v1, p16

    .line 572
    iput-object v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Bundle;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 575
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 576
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi26Parcelizer:I

    .line 577
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi21Parcelizer:J

    .line 578
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer:F

    .line 579
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RatingCompat:J

    .line 580
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->IconCompatParcelizer:J

    .line 581
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesCompatParcelizer:J

    .line 582
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    .line 583
    sget-object v0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer:Ljava/util/List;

    .line 584
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->write:J

    .line 585
    const-class v0, Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Bundle;

    .line 587
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->read:I

    return-void
.end method

.method public static write(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 22

    const/4 v0, 0x0

    if-eqz p0, :cond_60

    .line 804
    move-object/from16 v1, p0

    check-cast v1, Landroid/media/session/PlaybackState;

    .line 806
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->read(Landroid/media/session/PlaybackState;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2c

    .line 809
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 810
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 811
    invoke-static {v3}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->write(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_2c
    move-object/from16 v17, v0

    .line 816
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$IconCompatParcelizer;->read(Landroid/media/session/PlaybackState;)Landroid/os/Bundle;

    move-result-object v0

    move-object/from16 v20, v0

    .line 817
    invoke-static {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 822
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->AudioAttributesImplApi26Parcelizer(Landroid/media/session/PlaybackState;)I

    move-result v5

    .line 823
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->AudioAttributesImplBaseParcelizer(Landroid/media/session/PlaybackState;)J

    move-result-wide v6

    .line 824
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->write(Landroid/media/session/PlaybackState;)J

    move-result-wide v8

    .line 825
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->MediaBrowserCompatCustomActionResultReceiver(Landroid/media/session/PlaybackState;)F

    move-result v10

    .line 826
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->IconCompatParcelizer(Landroid/media/session/PlaybackState;)J

    move-result-wide v11

    .line 828
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->AudioAttributesCompatParcelizer(Landroid/media/session/PlaybackState;)Ljava/lang/CharSequence;

    move-result-object v14

    .line 829
    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->MediaBrowserCompatItemReceiver(Landroid/media/session/PlaybackState;)J

    move-result-wide v15

    .line 831
    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat;

    move-object v4, v0

    const/4 v13, 0x0

    invoke-static {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState;)J

    move-result-wide v18

    invoke-direct/range {v4 .. v20}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/List;JLandroid/os/Bundle;)V

    .line 833
    iput-object v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaDescriptionCompat:Landroid/media/session/PlaybackState;

    :cond_60
    return-object v0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()J
    .registers 3

    .line 663
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RatingCompat:J

    return-wide v0
.end method

.method public final AudioAttributesImplBaseParcelizer()I
    .registers 1

    .line 646
    iget p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi26Parcelizer:I

    return p0
.end method

.method public final IconCompatParcelizer()J
    .registers 3

    .line 729
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesCompatParcelizer:J

    return-wide v0
.end method

.method public final MediaBrowserCompatItemReceiver()J
    .registers 3

    .line 653
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi21Parcelizer:J

    return-wide v0
.end method

.method public final RemoteActionCompatParcelizer()F
    .registers 1

    .line 696
    iget p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer:F

    return p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()Ljava/lang/Object;
    .registers 9

    .line 849
    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaDescriptionCompat:Landroid/media/session/PlaybackState;

    if-nez v0, :cond_4f

    .line 850
    invoke-static {}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->AudioAttributesCompatParcelizer()Landroid/media/session/PlaybackState$Builder;

    move-result-object v0

    .line 851
    iget v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi26Parcelizer:I

    iget-wide v3, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi21Parcelizer:J

    iget v5, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer:F

    iget-wide v6, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RatingCompat:J

    move-object v1, v0

    invoke-static/range {v1 .. v7}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->write(Landroid/media/session/PlaybackState$Builder;IJFJ)V

    .line 852
    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->IconCompatParcelizer:J

    invoke-static {v0, v1, v2}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->write(Landroid/media/session/PlaybackState$Builder;J)V

    .line 853
    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesCompatParcelizer:J

    invoke-static {v0, v1, v2}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->read(Landroid/media/session/PlaybackState$Builder;J)V

    .line 854
    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState$Builder;Ljava/lang/CharSequence;)V

    .line 855
    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    .line 857
    invoke-virtual {v2}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/media/session/PlaybackState$CustomAction;

    .line 856
    invoke-static {v0, v2}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->AudioAttributesCompatParcelizer(Landroid/media/session/PlaybackState$Builder;Landroid/media/session/PlaybackState$CustomAction;)V

    goto :goto_29

    .line 859
    :cond_3f
    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->write:J

    invoke-static {v0, v1, v2}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState$Builder;J)V

    .line 861
    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Bundle;

    invoke-static {v0, v1}, Landroid/support/v4/media/session/PlaybackStateCompat$IconCompatParcelizer;->write(Landroid/media/session/PlaybackState$Builder;Landroid/os/Bundle;)V

    .line 863
    invoke-static {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->IconCompatParcelizer(Landroid/media/session/PlaybackState$Builder;)Landroid/media/session/PlaybackState;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaDescriptionCompat:Landroid/media/session/PlaybackState;

    .line 865
    :cond_4f
    iget-object p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaDescriptionCompat:Landroid/media/session/PlaybackState;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 4

    .line 592
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PlaybackState {state="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 593
    iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 594
    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi21Parcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 595
    const-string v1, ", buffered position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->IconCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 596
    const-string v1, ", speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 597
    const-string v1, ", updated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RatingCompat:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 598
    const-string v1, ", actions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesCompatParcelizer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 599
    const-string v1, ", error code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->read:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 600
    const-string v1, ", error message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 601
    const-string v1, ", custom actions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 602
    const-string v1, ", active item id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->write:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 603
    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 604
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()J
    .registers 3

    .line 781
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->write:J

    return-wide v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    .line 614
    iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi26Parcelizer:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 615
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi21Parcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 616
    iget v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 617
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RatingCompat:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 618
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->IconCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 619
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesCompatParcelizer:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 620
    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 621
    iget-object p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 622
    iget-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->write:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 623
    iget-object p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 625
    iget p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat;->read:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class android.support.v4.media.session.PlaybackStateCompat.AnonymousClass5 (android.support.v4.media.session.PlaybackStateCompat$5)
.class Landroid/support/v4/media/session/PlaybackStateCompat$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/PlaybackStateCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/session/PlaybackStateCompat;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 869
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 869
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$5;->read(Landroid/os/Parcel;)Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 869
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$5;->write(I)[Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object p0

    return-object p0
.end method

.method public read(Landroid/os/Parcel;)Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 2

    .line 872
    new-instance p0, Landroid/support/v4/media/session/PlaybackStateCompat;

    invoke-direct {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

.method public write(I)[Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 2

    .line 877
    new-array p0, p1, [Landroid/support/v4/media/session/PlaybackStateCompat;

    return-object p0
.end method

###### Class android.support.v4.media.session.PlaybackStateCompat.CustomAction (android.support.v4.media.session.PlaybackStateCompat$CustomAction)
.class public final Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/PlaybackStateCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CustomAction"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private final IconCompatParcelizer:I

.field private RemoteActionCompatParcelizer:Landroid/media/session/PlaybackState$CustomAction;

.field private final read:Landroid/os/Bundle;

.field private final write:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 975
    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$5;

    invoke-direct {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$5;-><init>()V

    sput-object v0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 904
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 905
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 906
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->write:Ljava/lang/CharSequence;

    .line 907
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->IconCompatParcelizer:I

    .line 908
    const-class v0, Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->read:Landroid/os/Bundle;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V
    .registers 5

    .line 897
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 898
    iput-object p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 899
    iput-object p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->write:Ljava/lang/CharSequence;

    .line 900
    iput p3, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->IconCompatParcelizer:I

    .line 901
    iput-object p4, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->read:Landroid/os/Bundle;

    return-void
.end method

.method public static write(Ljava/lang/Object;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
    .registers 6

    if-eqz p0, :cond_1f

    .line 940
    check-cast p0, Landroid/media/session/PlaybackState$CustomAction;

    .line 942
    invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->write(Landroid/media/session/PlaybackState$CustomAction;)Landroid/os/Bundle;

    move-result-object v0

    .line 943
    invoke-static {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->IconCompatParcelizer(Landroid/os/Bundle;)V

    .line 946
    invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState$CustomAction;)Ljava/lang/String;

    move-result-object v1

    .line 947
    invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->AudioAttributesCompatParcelizer(Landroid/media/session/PlaybackState$CustomAction;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 948
    new-instance v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    invoke-static {p0}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->read(Landroid/media/session/PlaybackState$CustomAction;)I

    move-result v4

    invoke-direct {v3, v1, v2, v4, v0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 950
    iput-object p0, v3, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->RemoteActionCompatParcelizer:Landroid/media/session/PlaybackState$CustomAction;

    return-object v3

    :cond_1f
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final IconCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 995
    iget-object p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/lang/Object;
    .registers 4

    .line 965
    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->RemoteActionCompatParcelizer:Landroid/media/session/PlaybackState$CustomAction;

    if-nez v0, :cond_18

    .line 969
    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->write:Ljava/lang/CharSequence;

    iget v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->IconCompatParcelizer:I

    .line 970
    invoke-static {v0, v1, v2}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->read(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/media/session/PlaybackState$CustomAction$Builder;

    move-result-object v0

    .line 971
    iget-object p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->read:Landroid/os/Bundle;

    invoke-static {v0, p0}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState$CustomAction$Builder;Landroid/os/Bundle;)V

    .line 972
    invoke-static {v0}, Landroid/support/v4/media/session/PlaybackStateCompat$write;->read(Landroid/media/session/PlaybackState$CustomAction$Builder;)Landroid/media/session/PlaybackState$CustomAction;

    move-result-object p0

    return-object p0

    :cond_18
    return-object v0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 1032
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Action:mName=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->write:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->IconCompatParcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mExtras="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->read:Landroid/os/Bundle;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 913
    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 914
    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->write:Ljava/lang/CharSequence;

    invoke-static {v0, p1, p2}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 915
    iget p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->IconCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 916
    iget-object p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;->read:Landroid/os/Bundle;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method

###### Class android.support.v4.media.session.PlaybackStateCompat.CustomAction.AnonymousClass5 (android.support.v4.media.session.PlaybackStateCompat$CustomAction$5)
.class Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 976
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
    .registers 2

    .line 980
    new-instance p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    invoke-direct {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Landroid/os/Parcel;)V

    return-object p0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 976
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$5;->IconCompatParcelizer(Landroid/os/Parcel;)Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    move-result-object p0

    return-object p0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 976
    invoke-virtual {p0, p1}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$5;->write(I)[Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    move-result-object p0

    return-object p0
.end method

.method public write(I)[Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
    .registers 2

    .line 985
    new-array p0, p1, [Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    return-object p0
.end method

###### Class android.support.v4.media.session.PlaybackStateCompat.CustomAction.write (android.support.v4.media.session.PlaybackStateCompat$CustomAction$write)
.class public final Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "write"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:I

.field private RemoteActionCompatParcelizer:Landroid/os/Bundle;

.field private final read:Ljava/lang/String;

.field private final write:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V
    .registers 5

    .line 1060
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1061
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_28

    .line 1065
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_20

    if-eqz p3, :cond_18

    .line 1073
    iput-object p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;->read:Ljava/lang/String;

    .line 1074
    iput-object p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;->write:Ljava/lang/CharSequence;

    .line 1075
    iput p3, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;->AudioAttributesCompatParcelizer:I

    return-void

    .line 1070
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You must specify an icon resource id to build a CustomAction"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1066
    :cond_20
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You must specify a name to build a CustomAction"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1062
    :cond_28
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You must specify an action to build a CustomAction"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final IconCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;
    .registers 5

    .line 1099
    new-instance v0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;

    iget-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;->read:Ljava/lang/String;

    iget-object v2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;->write:Ljava/lang/CharSequence;

    iget v3, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;->AudioAttributesCompatParcelizer:I

    iget-object p0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction$write;->RemoteActionCompatParcelizer:Landroid/os/Bundle;

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    return-object v0
.end method

###### Class android.support.v4.media.session.PlaybackStateCompat.IconCompatParcelizer (android.support.v4.media.session.PlaybackStateCompat$IconCompatParcelizer)
.class Landroid/support/v4/media/session/PlaybackStateCompat$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/PlaybackStateCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "IconCompatParcelizer"
.end annotation


# direct methods
.method static read(Landroid/media/session/PlaybackState;)Landroid/os/Bundle;
    .registers 1

    .line 1517
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method static write(Landroid/media/session/PlaybackState$Builder;Landroid/os/Bundle;)V
    .registers 2

    .line 1512
    invoke-virtual {p0, p1}, Landroid/media/session/PlaybackState$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/session/PlaybackState$Builder;

    return-void
.end method

###### Class android.support.v4.media.session.PlaybackStateCompat.read (android.support.v4.media.session.PlaybackStateCompat$read)
.class public final Landroid/support/v4/media/session/PlaybackStateCompat$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/PlaybackStateCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:J

.field private AudioAttributesImplApi21Parcelizer:Landroid/os/Bundle;

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:F

.field private IconCompatParcelizer:I

.field private MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

.field private MediaBrowserCompatItemReceiver:J

.field private MediaBrowserCompatMediaItem:J

.field private final RemoteActionCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;",
            ">;"
        }
    .end annotation
.end field

.field private read:J

.field private write:J


# direct methods
.method public constructor <init>()V
    .registers 3

    .line 1124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->RemoteActionCompatParcelizer:Ljava/util/List;

    const-wide/16 v0, -0x1

    .line 1118
    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->write:J

    return-void
.end method

.method public constructor <init>(Landroid/support/v4/media/session/PlaybackStateCompat;)V
    .registers 5

    .line 1133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->RemoteActionCompatParcelizer:Ljava/util/List;

    const-wide/16 v1, -0x1

    .line 1118
    iput-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->write:J

    .line 1134
    iget v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi26Parcelizer:I

    iput v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplApi26Parcelizer:I

    .line 1135
    iget-wide v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplApi21Parcelizer:J

    iput-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatItemReceiver:J

    .line 1136
    iget v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesImplBaseParcelizer:F

    iput v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplBaseParcelizer:F

    .line 1137
    iget-wide v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->RatingCompat:J

    iput-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatMediaItem:J

    .line 1138
    iget-wide v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->IconCompatParcelizer:J

    iput-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->read:J

    .line 1139
    iget-wide v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->AudioAttributesCompatParcelizer:J

    iput-wide v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesCompatParcelizer:J

    .line 1140
    iget v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->read:I

    iput v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->IconCompatParcelizer:I

    .line 1141
    iget-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    iput-object v1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    .line 1142
    iget-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer:Ljava/util/List;

    if-eqz v1, :cond_37

    .line 1143
    iget-object v1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1145
    :cond_37
    iget-wide v0, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->write:J

    iput-wide v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->write:J

    .line 1146
    iget-object p1, p1, Landroid/support/v4/media/session/PlaybackStateCompat;->MediaBrowserCompatItemReceiver:Landroid/os/Bundle;

    iput-object p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplApi21Parcelizer:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(J)Landroid/support/v4/media/session/PlaybackStateCompat$read;
    .registers 3

    .line 1326
    iput-wide p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->write:J

    return-object p0
.end method

.method public final IconCompatParcelizer(ILjava/lang/CharSequence;)Landroid/support/v4/media/session/PlaybackStateCompat$read;
    .registers 3

    .line 1352
    iput p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->IconCompatParcelizer:I

    .line 1353
    iput-object p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final IconCompatParcelizer()Landroid/support/v4/media/session/PlaybackStateCompat;
    .registers 22

    move-object/from16 v0, p0

    .line 1372
    new-instance v18, Landroid/support/v4/media/session/PlaybackStateCompat;

    move-object/from16 v1, v18

    iget v2, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplApi26Parcelizer:I

    iget-wide v3, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatItemReceiver:J

    iget-wide v5, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->read:J

    iget v7, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplBaseParcelizer:F

    iget-wide v8, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesCompatParcelizer:J

    iget v10, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->IconCompatParcelizer:I

    iget-object v11, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    iget-wide v12, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatMediaItem:J

    iget-object v14, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->RemoteActionCompatParcelizer:Ljava/util/List;

    move-object/from16 v19, v1

    move/from16 v20, v2

    iget-wide v1, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->write:J

    move-wide v15, v1

    iget-object v0, v0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplApi21Parcelizer:Landroid/os/Bundle;

    move-object/from16 v17, v0

    move-object/from16 v1, v19

    move/from16 v2, v20

    invoke-direct/range {v1 .. v17}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/List;JLandroid/os/Bundle;)V

    return-object v18
.end method

.method public final RemoteActionCompatParcelizer(J)Landroid/support/v4/media/session/PlaybackStateCompat$read;
    .registers 3

    .line 1235
    iput-wide p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->read:J

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Landroid/os/Bundle;)Landroid/support/v4/media/session/PlaybackStateCompat$read;
    .registers 2

    .line 1364
    iput-object p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplApi21Parcelizer:Landroid/os/Bundle;

    return-object p0
.end method

.method public final write(IJFJ)Landroid/support/v4/media/session/PlaybackStateCompat$read;
    .registers 7

    .line 1220
    iput p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplApi26Parcelizer:I

    .line 1221
    iput-wide p2, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatItemReceiver:J

    .line 1222
    iput-wide p5, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->MediaBrowserCompatMediaItem:J

    .line 1223
    iput p4, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesImplBaseParcelizer:F

    return-object p0
.end method

.method public final write(J)Landroid/support/v4/media/session/PlaybackStateCompat$read;
    .registers 3

    .line 1270
    iput-wide p1, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->AudioAttributesCompatParcelizer:J

    return-object p0
.end method

.method public final write(Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;)Landroid/support/v4/media/session/PlaybackStateCompat$read;
    .registers 3

    if-eqz p1, :cond_8

    .line 1314
    iget-object v0, p0, Landroid/support/v4/media/session/PlaybackStateCompat$read;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 1311
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "You may not add a null CustomAction to PlaybackStateCompat"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

###### Class android.support.v4.media.session.PlaybackStateCompat.write (android.support.v4.media.session.PlaybackStateCompat$write)
.class Landroid/support/v4/media/session/PlaybackStateCompat$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/session/PlaybackStateCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "write"
.end annotation


# direct methods
.method static AudioAttributesCompatParcelizer()Landroid/media/session/PlaybackState$Builder;
    .registers 1

    .line 1384
    new-instance v0, Landroid/media/session/PlaybackState$Builder;

    invoke-direct {v0}, Landroid/media/session/PlaybackState$Builder;-><init>()V

    return-object v0
.end method

.method static AudioAttributesCompatParcelizer(Landroid/media/session/PlaybackState$CustomAction;)Ljava/lang/CharSequence;
    .registers 1

    .line 1497
    invoke-virtual {p0}, Landroid/media/session/PlaybackState$CustomAction;->getName()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static AudioAttributesCompatParcelizer(Landroid/media/session/PlaybackState;)Ljava/lang/CharSequence;
    .registers 1

    .line 1456
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getErrorMessage()Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static AudioAttributesCompatParcelizer(Landroid/media/session/PlaybackState$Builder;Landroid/media/session/PlaybackState$CustomAction;)V
    .registers 2

    .line 1411
    invoke-virtual {p0, p1}, Landroid/media/session/PlaybackState$Builder;->addCustomAction(Landroid/media/session/PlaybackState$CustomAction;)Landroid/media/session/PlaybackState$Builder;

    return-void
.end method

.method static AudioAttributesImplApi26Parcelizer(Landroid/media/session/PlaybackState;)I
    .registers 1

    .line 1431
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getState()I

    move-result p0

    return p0
.end method

.method static AudioAttributesImplBaseParcelizer(Landroid/media/session/PlaybackState;)J
    .registers 3

    .line 1436
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getPosition()J

    move-result-wide v0

    return-wide v0
.end method

.method static IconCompatParcelizer(Landroid/media/session/PlaybackState;)J
    .registers 3

    .line 1451
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getActions()J

    move-result-wide v0

    return-wide v0
.end method

.method static IconCompatParcelizer(Landroid/media/session/PlaybackState$Builder;)Landroid/media/session/PlaybackState;
    .registers 1

    .line 1426
    invoke-virtual {p0}, Landroid/media/session/PlaybackState$Builder;->build()Landroid/media/session/PlaybackState;

    move-result-object p0

    return-object p0
.end method

.method static MediaBrowserCompatCustomActionResultReceiver(Landroid/media/session/PlaybackState;)F
    .registers 1

    .line 1446
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getPlaybackSpeed()F

    move-result p0

    return p0
.end method

.method static MediaBrowserCompatItemReceiver(Landroid/media/session/PlaybackState;)J
    .registers 3

    .line 1461
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getLastPositionUpdateTime()J

    move-result-wide v0

    return-wide v0
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState;)J
    .registers 3

    .line 1466
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getActiveQueueItemId()J

    move-result-wide v0

    return-wide v0
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState$CustomAction;)Ljava/lang/String;
    .registers 1

    .line 1492
    invoke-virtual {p0}, Landroid/media/session/PlaybackState$CustomAction;->getAction()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState$Builder;J)V
    .registers 3

    .line 1416
    invoke-virtual {p0, p1, p2}, Landroid/media/session/PlaybackState$Builder;->setActiveQueueItemId(J)Landroid/media/session/PlaybackState$Builder;

    return-void
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState$Builder;Ljava/lang/CharSequence;)V
    .registers 2

    .line 1405
    invoke-virtual {p0, p1}, Landroid/media/session/PlaybackState$Builder;->setErrorMessage(Ljava/lang/CharSequence;)Landroid/media/session/PlaybackState$Builder;

    return-void
.end method

.method static RemoteActionCompatParcelizer(Landroid/media/session/PlaybackState$CustomAction$Builder;Landroid/os/Bundle;)V
    .registers 2

    .line 1477
    invoke-virtual {p0, p1}, Landroid/media/session/PlaybackState$CustomAction$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/session/PlaybackState$CustomAction$Builder;

    return-void
.end method

.method static read(Landroid/media/session/PlaybackState$CustomAction;)I
    .registers 1

    .line 1502
    invoke-virtual {p0}, Landroid/media/session/PlaybackState$CustomAction;->getIcon()I

    move-result p0

    return p0
.end method

.method static read(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/media/session/PlaybackState$CustomAction$Builder;
    .registers 4

    .line 1472
    new-instance v0, Landroid/media/session/PlaybackState$CustomAction$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/media/session/PlaybackState$CustomAction$Builder;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    return-object v0
.end method

.method static read(Landroid/media/session/PlaybackState$CustomAction$Builder;)Landroid/media/session/PlaybackState$CustomAction;
    .registers 1

    .line 1482
    invoke-virtual {p0}, Landroid/media/session/PlaybackState$CustomAction$Builder;->build()Landroid/media/session/PlaybackState$CustomAction;

    move-result-object p0

    return-object p0
.end method

.method static read(Landroid/media/session/PlaybackState;)Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/media/session/PlaybackState;",
            ")",
            "Ljava/util/List<",
            "Landroid/media/session/PlaybackState$CustomAction;",
            ">;"
        }
    .end annotation

    .line 1421
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getCustomActions()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static read(Landroid/media/session/PlaybackState$Builder;J)V
    .registers 3

    .line 1400
    invoke-virtual {p0, p1, p2}, Landroid/media/session/PlaybackState$Builder;->setActions(J)Landroid/media/session/PlaybackState$Builder;

    return-void
.end method

.method static write(Landroid/media/session/PlaybackState;)J
    .registers 3

    .line 1441
    invoke-virtual {p0}, Landroid/media/session/PlaybackState;->getBufferedPosition()J

    move-result-wide v0

    return-wide v0
.end method

.method static write(Landroid/media/session/PlaybackState$CustomAction;)Landroid/os/Bundle;
    .registers 1

    .line 1487
    invoke-virtual {p0}, Landroid/media/session/PlaybackState$CustomAction;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method static write(Landroid/media/session/PlaybackState$Builder;IJFJ)V
    .registers 7

    .line 1390
    invoke-virtual/range {p0 .. p6}, Landroid/media/session/PlaybackState$Builder;->setState(IJFJ)Landroid/media/session/PlaybackState$Builder;

    return-void
.end method

.method static write(Landroid/media/session/PlaybackState$Builder;J)V
    .registers 3

    .line 1395
    invoke-virtual {p0, p1, p2}, Landroid/media/session/PlaybackState$Builder;->setBufferedPosition(J)Landroid/media/session/PlaybackState$Builder;

    return-void
.end method
