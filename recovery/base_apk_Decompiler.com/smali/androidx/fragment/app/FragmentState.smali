###### Class androidx.fragment.app.FragmentState (androidx.fragment.app.FragmentState)
.class public final Landroidx/fragment/app/FragmentState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/FragmentState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final AudioAttributesCompatParcelizer:Z

.field final AudioAttributesImplApi21Parcelizer:Z

.field final AudioAttributesImplApi26Parcelizer:Z

.field final AudioAttributesImplBaseParcelizer:Z

.field final IconCompatParcelizer:Ljava/lang/String;

.field final MediaBrowserCompatCustomActionResultReceiver:Z

.field final MediaBrowserCompatItemReceiver:I

.field public final MediaBrowserCompatMediaItem:Z

.field final MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

.field final MediaDescriptionCompat:Ljava/lang/String;

.field public final MediaMetadataCompat:Ljava/lang/String;

.field public final RatingCompat:I

.field final RemoteActionCompatParcelizer:Z

.field final read:I

.field final write:I


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 177
    new-instance v0, Landroidx/fragment/app/FragmentState$5;

    invoke-direct {v0}, Landroidx/fragment/app/FragmentState$5;-><init>()V

    sput-object v0, Landroidx/fragment/app/FragmentState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .registers 5

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentState;->IconCompatParcelizer:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentState;->MediaDescriptionCompat:Ljava/lang/String;

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_19

    move v0, v1

    goto :goto_1a

    :cond_19
    move v0, v2

    :goto_1a
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesCompatParcelizer:Z

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_24

    move v0, v1

    goto :goto_25

    :cond_24
    move v0, v2

    :goto_25
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi21Parcelizer:Z

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/FragmentState;->write:I

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/FragmentState;->read:I

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_41

    move v0, v1

    goto :goto_42

    :cond_41
    move v0, v2

    :goto_42
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_4c

    move v0, v1

    goto :goto_4d

    :cond_4c
    move v0, v2

    :goto_4d
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi26Parcelizer:Z

    .line 72
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_57

    move v0, v1

    goto :goto_58

    :cond_57
    move v0, v2

    :goto_58
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->RemoteActionCompatParcelizer:Z

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_62

    move v0, v1

    goto :goto_63

    :cond_62
    move v0, v2

    :goto_63
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplBaseParcelizer:Z

    .line 74
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatItemReceiver:I

    .line 75
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentState;->MediaMetadataCompat:Ljava/lang/String;

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/FragmentState;->RatingCompat:I

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_7e

    goto :goto_7f

    :cond_7e
    move v1, v2

    :goto_7f
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatMediaItem:Z

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .registers 3

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/FragmentState;->IconCompatParcelizer:Ljava/lang/String;

    .line 46
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/FragmentState;->MediaDescriptionCompat:Ljava/lang/String;

    .line 47
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mFromLayout:Z

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesCompatParcelizer:Z

    .line 48
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mInDynamicContainer:Z

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi21Parcelizer:Z

    .line 49
    iget v0, p1, Landroidx/fragment/app/Fragment;->mFragmentId:I

    iput v0, p0, Landroidx/fragment/app/FragmentState;->write:I

    .line 50
    iget v0, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    iput v0, p0, Landroidx/fragment/app/FragmentState;->read:I

    .line 51
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    .line 52
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mRetainInstance:Z

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatCustomActionResultReceiver:Z

    .line 53
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi26Parcelizer:Z

    .line 54
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->RemoteActionCompatParcelizer:Z

    .line 55
    iget-boolean v0, p1, Landroidx/fragment/app/Fragment;->mHidden:Z

    iput-boolean v0, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplBaseParcelizer:Z

    .line 56
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mMaxState:Lo/anyIgnorals$write;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatItemReceiver:I

    .line 57
    iget-object v0, p1, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/FragmentState;->MediaMetadataCompat:Ljava/lang/String;

    .line 58
    iget v0, p1, Landroidx/fragment/app/Fragment;->mTargetRequestCode:I

    iput v0, p0, Landroidx/fragment/app/FragmentState;->RatingCompat:I

    .line 59
    iget-boolean p1, p1, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    iput-boolean p1, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatMediaItem:Z

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 110
    const-string v1, "FragmentState{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    iget-object v1, p0, Landroidx/fragment/app/FragmentState;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    iget-object v1, p0, Landroidx/fragment/app/FragmentState;->MediaDescriptionCompat:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    const-string v1, ")}:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesCompatParcelizer:Z

    if-eqz v1, :cond_29

    .line 116
    const-string v1, " fromLayout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    :cond_29
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi21Parcelizer:Z

    if-eqz v1, :cond_32

    .line 119
    const-string v1, " dynamicContainer"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    :cond_32
    iget v1, p0, Landroidx/fragment/app/FragmentState;->read:I

    if-eqz v1, :cond_44

    .line 122
    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    iget v1, p0, Landroidx/fragment/app/FragmentState;->read:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    :cond_44
    iget-object v1, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    if-eqz v1, :cond_58

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_58

    .line 126
    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    iget-object v1, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    :cond_58
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz v1, :cond_61

    .line 130
    const-string v1, " retainInstance"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    :cond_61
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v1, :cond_6a

    .line 133
    const-string v1, " removing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    :cond_6a
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentState;->RemoteActionCompatParcelizer:Z

    if-eqz v1, :cond_73

    .line 136
    const-string v1, " detached"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    :cond_73
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplBaseParcelizer:Z

    if-eqz v1, :cond_7c

    .line 139
    const-string v1, " hidden"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    :cond_7c
    iget-object v1, p0, Landroidx/fragment/app/FragmentState;->MediaMetadataCompat:Ljava/lang/String;

    if-eqz v1, :cond_94

    .line 142
    const-string v1, " targetWho="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    iget-object v1, p0, Landroidx/fragment/app/FragmentState;->MediaMetadataCompat:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    const-string v1, " targetRequestCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    iget v1, p0, Landroidx/fragment/app/FragmentState;->RatingCompat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    :cond_94
    iget-boolean p0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatMediaItem:Z

    if-eqz p0, :cond_9d

    .line 148
    const-string p0, " userVisibleHint"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    :cond_9d
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write(Lo/NopAnnotationIntrospector1;Ljava/lang/ClassLoader;)Landroidx/fragment/app/Fragment;
    .registers 4

    .line 87
    iget-object v0, p0, Landroidx/fragment/app/FragmentState;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lo/NopAnnotationIntrospector1;->read(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    .line 88
    iget-object p2, p0, Landroidx/fragment/app/FragmentState;->MediaDescriptionCompat:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 89
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesCompatParcelizer:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mFromLayout:Z

    .line 90
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi21Parcelizer:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mInDynamicContainer:Z

    const/4 p2, 0x1

    .line 91
    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mRestored:Z

    .line 92
    iget p2, p0, Landroidx/fragment/app/FragmentState;->write:I

    iput p2, p1, Landroidx/fragment/app/Fragment;->mFragmentId:I

    .line 93
    iget p2, p0, Landroidx/fragment/app/FragmentState;->read:I

    iput p2, p1, Landroidx/fragment/app/Fragment;->mContainerId:I

    .line 94
    iget-object p2, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    .line 95
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatCustomActionResultReceiver:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mRetainInstance:Z

    .line 96
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi26Parcelizer:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 97
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->RemoteActionCompatParcelizer:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mDetached:Z

    .line 98
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplBaseParcelizer:Z

    iput-boolean p2, p1, Landroidx/fragment/app/Fragment;->mHidden:Z

    .line 99
    invoke-static {}, Lo/anyIgnorals$write;->values()[Lo/anyIgnorals$write;

    move-result-object p2

    iget v0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatItemReceiver:I

    aget-object p2, p2, v0

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mMaxState:Lo/anyIgnorals$write;

    .line 100
    iget-object p2, p0, Landroidx/fragment/app/FragmentState;->MediaMetadataCompat:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/Fragment;->mTargetWho:Ljava/lang/String;

    .line 101
    iget p2, p0, Landroidx/fragment/app/FragmentState;->RatingCompat:I

    iput p2, p1, Landroidx/fragment/app/Fragment;->mTargetRequestCode:I

    .line 102
    iget-boolean p0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatMediaItem:Z

    iput-boolean p0, p1, Landroidx/fragment/app/Fragment;->mUserVisibleHint:Z

    return-object p1
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 160
    iget-object p2, p0, Landroidx/fragment/app/FragmentState;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 161
    iget-object p2, p0, Landroidx/fragment/app/FragmentState;->MediaDescriptionCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 162
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesCompatParcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 163
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi21Parcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 164
    iget p2, p0, Landroidx/fragment/app/FragmentState;->write:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    iget p2, p0, Landroidx/fragment/app/FragmentState;->read:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    iget-object p2, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 167
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatCustomActionResultReceiver:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplApi26Parcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 169
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->RemoteActionCompatParcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 170
    iget-boolean p2, p0, Landroidx/fragment/app/FragmentState;->AudioAttributesImplBaseParcelizer:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    iget p2, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatItemReceiver:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 172
    iget-object p2, p0, Landroidx/fragment/app/FragmentState;->MediaMetadataCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 173
    iget p2, p0, Landroidx/fragment/app/FragmentState;->RatingCompat:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 174
    iget-boolean p0, p0, Landroidx/fragment/app/FragmentState;->MediaBrowserCompatMediaItem:Z

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.fragment.app.FragmentState.AnonymousClass5 (androidx.fragment.app.FragmentState$5)
.class final Landroidx/fragment/app/FragmentState$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/FragmentState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/fragment/app/FragmentState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/fragment/app/FragmentState;
    .registers 1

    .line 186
    new-array p0, p0, [Landroidx/fragment/app/FragmentState;

    return-object p0
.end method

.method private static read(Landroid/os/Parcel;)Landroidx/fragment/app/FragmentState;
    .registers 2

    .line 181
    new-instance v0, Landroidx/fragment/app/FragmentState;

    invoke-direct {v0, p0}, Landroidx/fragment/app/FragmentState;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 178
    invoke-static {p1}, Landroidx/fragment/app/FragmentState$5;->read(Landroid/os/Parcel;)Landroidx/fragment/app/FragmentState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 178
    invoke-static {p1}, Landroidx/fragment/app/FragmentState$5;->RemoteActionCompatParcelizer(I)[Landroidx/fragment/app/FragmentState;

    move-result-object p0

    return-object p0
.end method
