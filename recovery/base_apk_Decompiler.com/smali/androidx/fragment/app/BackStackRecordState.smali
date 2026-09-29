###### Class androidx.fragment.app.BackStackRecordState (androidx.fragment.app.BackStackRecordState)
.class final Landroidx/fragment/app/BackStackRecordState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/BackStackRecordState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final AudioAttributesCompatParcelizer:I

.field final AudioAttributesImplApi21Parcelizer:[I

.field final AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

.field final AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final IconCompatParcelizer:[I

.field final MediaBrowserCompatCustomActionResultReceiver:I

.field final MediaBrowserCompatItemReceiver:[I

.field final MediaBrowserCompatMediaItem:I

.field final MediaBrowserCompatSearchResultReceiver:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final MediaDescriptionCompat:Z

.field final RatingCompat:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final RemoteActionCompatParcelizer:Ljava/lang/CharSequence;

.field final read:I

.field final write:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 211
    new-instance v0, Landroidx/fragment/app/BackStackRecordState$5;

    invoke-direct {v0}, Landroidx/fragment/app/BackStackRecordState$5;-><init>()V

    sput-object v0, Landroidx/fragment/app/BackStackRecordState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatItemReceiver:[I

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->IconCompatParcelizer:[I

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatMediaItem:I

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->read:I

    .line 95
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->RemoteActionCompatParcelizer:Ljava/lang/CharSequence;

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesCompatParcelizer:I

    .line 97
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->write:Ljava/lang/CharSequence;

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatSearchResultReceiver:Ljava/util/ArrayList;

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->RatingCompat:Ljava/util/ArrayList;

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_61

    const/4 p1, 0x1

    goto :goto_62

    :cond_61
    const/4 p1, 0x0

    :goto_62
    iput-boolean p1, p0, Landroidx/fragment/app/BackStackRecordState;->MediaDescriptionCompat:Z

    return-void
.end method

.method constructor <init>(Lo/_refinePropertyInclusion;)V
    .registers 9

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iget-object v0, p1, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    mul-int/lit8 v1, v0, 0x6

    .line 52
    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    .line 54
    iget-boolean v1, p1, Lo/_doAddInjectable;->RemoteActionCompatParcelizer:Z

    if-eqz v1, :cond_ae

    .line 58
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    .line 59
    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatItemReceiver:[I

    .line 60
    new-array v1, v0, [I

    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->IconCompatParcelizer:[I

    const/4 v1, 0x0

    move v2, v1

    :goto_24
    if-ge v2, v0, :cond_85

    .line 63
    iget-object v3, p1, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/_doAddInjectable$write;

    .line 64
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    iget v5, v3, Lo/_doAddInjectable$write;->AudioAttributesCompatParcelizer:I

    aput v5, v4, v1

    .line 65
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    iget-object v5, v3, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    if-eqz v5, :cond_3f

    iget-object v5, v3, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    iget-object v5, v5, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    goto :goto_40

    :cond_3f
    const/4 v5, 0x0

    :goto_40
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x1

    iget-boolean v6, v3, Lo/_doAddInjectable$write;->AudioAttributesImplApi21Parcelizer:Z

    aput v6, v4, v5

    .line 67
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x2

    iget v6, v3, Lo/_doAddInjectable$write;->write:I

    aput v6, v4, v5

    .line 68
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x3

    iget v6, v3, Lo/_doAddInjectable$write;->read:I

    aput v6, v4, v5

    .line 69
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x4

    iget v6, v3, Lo/_doAddInjectable$write;->MediaBrowserCompatCustomActionResultReceiver:I

    aput v6, v4, v5

    .line 70
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x6

    add-int/lit8 v1, v1, 0x5

    iget v6, v3, Lo/_doAddInjectable$write;->AudioAttributesImplApi26Parcelizer:I

    aput v6, v4, v1

    .line 71
    iget-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatItemReceiver:[I

    iget-object v4, v3, Lo/_doAddInjectable$write;->MediaBrowserCompatItemReceiver:Lo/anyIgnorals$write;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v4, v1, v2

    .line 72
    iget-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->IconCompatParcelizer:[I

    iget-object v3, v3, Lo/_doAddInjectable$write;->RemoteActionCompatParcelizer:Lo/anyIgnorals$write;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    move v1, v5

    goto :goto_24

    .line 74
    :cond_85
    iget v0, p1, Lo/_doAddInjectable;->onCommand:I

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatMediaItem:I

    .line 75
    iget-object v0, p1, Lo/_doAddInjectable;->RatingCompat:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    .line 76
    iget v0, p1, Lo/_refinePropertyInclusion;->write:I

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 77
    iget v0, p1, Lo/_doAddInjectable;->MediaBrowserCompatItemReceiver:I

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->read:I

    .line 78
    iget-object v0, p1, Lo/_doAddInjectable;->AudioAttributesImplBaseParcelizer:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->RemoteActionCompatParcelizer:Ljava/lang/CharSequence;

    .line 79
    iget v0, p1, Lo/_doAddInjectable;->AudioAttributesCompatParcelizer:I

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesCompatParcelizer:I

    .line 80
    iget-object v0, p1, Lo/_doAddInjectable;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->write:Ljava/lang/CharSequence;

    .line 81
    iget-object v0, p1, Lo/_doAddInjectable;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatSearchResultReceiver:Ljava/util/ArrayList;

    .line 82
    iget-object v0, p1, Lo/_doAddInjectable;->onCustomAction:Ljava/util/ArrayList;

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->RatingCompat:Ljava/util/ArrayList;

    .line 83
    iget-boolean p1, p1, Lo/_doAddInjectable;->handleMediaPlayPauseIfPendingOnHandler:Z

    iput-boolean p1, p0, Landroidx/fragment/app/BackStackRecordState;->MediaDescriptionCompat:Z

    return-void

    .line 55
    :cond_ae
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Not on back stack"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private RemoteActionCompatParcelizer(Lo/_refinePropertyInclusion;)V
    .registers 10

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    .line 155
    :goto_3
    iget-object v3, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    array-length v3, v3

    const/4 v4, 0x1

    if-ge v1, v3, :cond_7e

    .line 156
    new-instance v3, Lo/_doAddInjectable$write;

    invoke-direct {v3}, Lo/_doAddInjectable$write;-><init>()V

    .line 157
    iget-object v5, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v6, v1, 0x1

    aget v5, v5, v1

    iput v5, v3, Lo/_doAddInjectable$write;->AudioAttributesCompatParcelizer:I

    const/4 v5, 0x2

    .line 158
    invoke-static {v5}, Landroidx/fragment/app/FragmentManager;->write(I)Z

    move-result v5

    if-eqz v5, :cond_24

    .line 159
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v5, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    aget v5, v5, v6

    .line 162
    :cond_24
    invoke-static {}, Lo/anyIgnorals$write;->values()[Lo/anyIgnorals$write;

    move-result-object v5

    iget-object v7, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatItemReceiver:[I

    aget v7, v7, v2

    aget-object v5, v5, v7

    iput-object v5, v3, Lo/_doAddInjectable$write;->MediaBrowserCompatItemReceiver:Lo/anyIgnorals$write;

    .line 163
    invoke-static {}, Lo/anyIgnorals$write;->values()[Lo/anyIgnorals$write;

    move-result-object v5

    iget-object v7, p0, Landroidx/fragment/app/BackStackRecordState;->IconCompatParcelizer:[I

    aget v7, v7, v2

    aget-object v5, v5, v7

    iput-object v5, v3, Lo/_doAddInjectable$write;->RemoteActionCompatParcelizer:Lo/anyIgnorals$write;

    .line 164
    iget-object v5, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    aget v5, v5, v6

    if-nez v5, :cond_43

    move v4, v0

    :cond_43
    iput-boolean v4, v3, Lo/_doAddInjectable$write;->AudioAttributesImplApi21Parcelizer:Z

    .line 165
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x2

    aget v4, v4, v5

    iput v4, v3, Lo/_doAddInjectable$write;->write:I

    .line 166
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x3

    aget v4, v4, v5

    iput v4, v3, Lo/_doAddInjectable$write;->read:I

    .line 167
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x4

    aget v4, v4, v5

    iput v4, v3, Lo/_doAddInjectable$write;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 168
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    add-int/lit8 v5, v1, 0x6

    add-int/lit8 v1, v1, 0x5

    aget v1, v4, v1

    iput v1, v3, Lo/_doAddInjectable$write;->AudioAttributesImplApi26Parcelizer:I

    .line 169
    iget v1, v3, Lo/_doAddInjectable$write;->write:I

    iput v1, p1, Lo/_doAddInjectable;->AudioAttributesImplApi26Parcelizer:I

    .line 170
    iget v1, v3, Lo/_doAddInjectable$write;->read:I

    iput v1, p1, Lo/_doAddInjectable;->MediaBrowserCompatSearchResultReceiver:I

    .line 171
    iget v1, v3, Lo/_doAddInjectable$write;->MediaBrowserCompatCustomActionResultReceiver:I

    iput v1, p1, Lo/_doAddInjectable;->MediaBrowserCompatMediaItem:I

    .line 172
    iget v1, v3, Lo/_doAddInjectable$write;->AudioAttributesImplApi26Parcelizer:I

    iput v1, p1, Lo/_doAddInjectable;->MediaMetadataCompat:I

    .line 173
    invoke-virtual {p1, v3}, Lo/_refinePropertyInclusion;->RemoteActionCompatParcelizer(Lo/_doAddInjectable$write;)V

    add-int/lit8 v2, v2, 0x1

    move v1, v5

    goto :goto_3

    .line 176
    :cond_7e
    iget v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatMediaItem:I

    iput v0, p1, Lo/_doAddInjectable;->onCommand:I

    .line 177
    iget-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    iput-object v0, p1, Lo/_doAddInjectable;->RatingCompat:Ljava/lang/String;

    .line 178
    iput-boolean v4, p1, Lo/_doAddInjectable;->RemoteActionCompatParcelizer:Z

    .line 179
    iget v0, p0, Landroidx/fragment/app/BackStackRecordState;->read:I

    iput v0, p1, Lo/_doAddInjectable;->MediaBrowserCompatItemReceiver:I

    .line 180
    iget-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->RemoteActionCompatParcelizer:Ljava/lang/CharSequence;

    iput-object v0, p1, Lo/_doAddInjectable;->AudioAttributesImplBaseParcelizer:Ljava/lang/CharSequence;

    .line 181
    iget v0, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesCompatParcelizer:I

    iput v0, p1, Lo/_doAddInjectable;->AudioAttributesCompatParcelizer:I

    .line 182
    iget-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->write:Ljava/lang/CharSequence;

    iput-object v0, p1, Lo/_doAddInjectable;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/CharSequence;

    .line 183
    iget-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatSearchResultReceiver:Ljava/util/ArrayList;

    iput-object v0, p1, Lo/_doAddInjectable;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/util/ArrayList;

    .line 184
    iget-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->RatingCompat:Ljava/util/ArrayList;

    iput-object v0, p1, Lo/_doAddInjectable;->onCustomAction:Ljava/util/ArrayList;

    .line 185
    iget-boolean p0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaDescriptionCompat:Z

    iput-boolean p0, p1, Lo/_doAddInjectable;->handleMediaPlayPauseIfPendingOnHandler:Z

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroidx/fragment/app/FragmentManager;)Lo/_refinePropertyInclusion;
    .registers 6

    .line 111
    new-instance v0, Lo/_refinePropertyInclusion;

    invoke-direct {v0, p1}, Lo/_refinePropertyInclusion;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 112
    invoke-direct {p0, v0}, Landroidx/fragment/app/BackStackRecordState;->RemoteActionCompatParcelizer(Lo/_refinePropertyInclusion;)V

    .line 113
    iget v1, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatCustomActionResultReceiver:I

    iput v1, v0, Lo/_refinePropertyInclusion;->write:I

    const/4 v1, 0x0

    .line 114
    :goto_d
    iget-object v2, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_30

    .line 115
    iget-object v2, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_2d

    .line 117
    iget-object v3, v0, Lo/_doAddInjectable;->MediaDescriptionCompat:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/_doAddInjectable$write;

    invoke-virtual {p1, v2}, Landroidx/fragment/app/FragmentManager;->RemoteActionCompatParcelizer(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v2

    iput-object v2, v3, Lo/_doAddInjectable$write;->IconCompatParcelizer:Landroidx/fragment/app/Fragment;

    :cond_2d
    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_30
    const/4 p0, 0x1

    .line 120
    invoke-virtual {v0, p0}, Lo/_refinePropertyInclusion;->write(I)V

    return-object v0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 195
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi21Parcelizer:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 196
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplBaseParcelizer:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 197
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatItemReceiver:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 198
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->IconCompatParcelizer:[I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 199
    iget p2, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatMediaItem:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 200
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 201
    iget p2, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 202
    iget p2, p0, Landroidx/fragment/app/BackStackRecordState;->read:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 203
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->RemoteActionCompatParcelizer:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 204
    iget p2, p0, Landroidx/fragment/app/BackStackRecordState;->AudioAttributesCompatParcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 205
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->write:Ljava/lang/CharSequence;

    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 206
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->MediaBrowserCompatSearchResultReceiver:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 207
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->RatingCompat:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 208
    iget-boolean p0, p0, Landroidx/fragment/app/BackStackRecordState;->MediaDescriptionCompat:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.fragment.app.BackStackRecordState.AnonymousClass5 (androidx.fragment.app.BackStackRecordState$5)
.class final Landroidx/fragment/app/BackStackRecordState$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/BackStackRecordState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/fragment/app/BackStackRecordState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/fragment/app/BackStackRecordState;
    .registers 2

    .line 215
    new-instance v0, Landroidx/fragment/app/BackStackRecordState;

    invoke-direct {v0, p0}, Landroidx/fragment/app/BackStackRecordState;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method private static read(I)[Landroidx/fragment/app/BackStackRecordState;
    .registers 1

    .line 220
    new-array p0, p0, [Landroidx/fragment/app/BackStackRecordState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 212
    invoke-static {p1}, Landroidx/fragment/app/BackStackRecordState$5;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Landroidx/fragment/app/BackStackRecordState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 212
    invoke-static {p1}, Landroidx/fragment/app/BackStackRecordState$5;->read(I)[Landroidx/fragment/app/BackStackRecordState;

    move-result-object p0

    return-object p0
.end method
