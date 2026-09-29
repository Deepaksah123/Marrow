###### Class com.airbnb.epoxy.ViewHolderState (com.airbnb.epoxy.ViewHolderState)
.class public Lcom/airbnb/epoxy/ViewHolderState;
.super Lo/setPresenter;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/epoxy/ViewHolderState$ViewState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/setPresenter<",
        "Lcom/airbnb/epoxy/ViewHolderState$ViewState;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/airbnb/epoxy/ViewHolderState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 56
    new-instance v0, Lcom/airbnb/epoxy/ViewHolderState$3;

    invoke-direct {v0}, Lcom/airbnb/epoxy/ViewHolderState$3;-><init>()V

    sput-object v0, Lcom/airbnb/epoxy/ViewHolderState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 34
    invoke-direct {p0}, Lo/setPresenter;-><init>()V

    return-void
.end method

.method private constructor <init>(I)V
    .registers 2

    .line 38
    invoke-direct {p0, p1}, Lo/setPresenter;-><init>(I)V

    return-void
.end method

.method synthetic constructor <init>(IB)V
    .registers 3

    .line 33
    invoke-direct {p0, p1}, Lcom/airbnb/epoxy/ViewHolderState;-><init>(I)V

    return-void
.end method

.method public static IconCompatParcelizer(Lo/getMaxSeekToPreviousPosition;)V
    .registers 1

    .line 109
    invoke-virtual {p0}, Lo/getMaxSeekToPreviousPosition;->write()Lo/getCurrentPeriodIndex;

    return-void
.end method

.method public static write(Lo/getMaxSeekToPreviousPosition;)V
    .registers 1

    .line 88
    invoke-virtual {p0}, Lo/getMaxSeekToPreviousPosition;->write()Lo/getCurrentPeriodIndex;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 7

    .line 48
    invoke-virtual {p0}, Lo/setPresenter;->write()I

    move-result p2

    .line 49
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    move v1, v0

    :goto_9
    if-ge v1, p2, :cond_1e

    .line 51
    invoke-virtual {p0, v1}, Lo/setPresenter;->AudioAttributesCompatParcelizer(I)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 52
    invoke-virtual {p0, v1}, Lo/setPresenter;->IconCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_1e
    return-void
.end method

###### Class com.airbnb.epoxy.ViewHolderState.AnonymousClass3 (com.airbnb.epoxy.ViewHolderState$3)
.class final Lcom/airbnb/epoxy/ViewHolderState$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/ViewHolderState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/airbnb/epoxy/ViewHolderState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static read(Landroid/os/Parcel;)Lcom/airbnb/epoxy/ViewHolderState;
    .registers 7

    .line 63
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 64
    new-instance v1, Lcom/airbnb/epoxy/ViewHolderState;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/airbnb/epoxy/ViewHolderState;-><init>(IB)V

    :goto_a
    if-ge v2, v0, :cond_22

    .line 67
    invoke-virtual {p0}, Landroid/os/Parcel;->readLong()J

    move-result-wide v3

    .line 68
    const-class v5, Lcom/airbnb/epoxy/ViewHolderState$ViewState;

    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {p0, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v5

    check-cast v5, Lcom/airbnb/epoxy/ViewHolderState$ViewState;

    .line 69
    invoke-virtual {v1, v3, v4, v5}, Lo/setPresenter;->write(JLjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_22
    return-object v1
.end method

.method private static read(I)[Lcom/airbnb/epoxy/ViewHolderState;
    .registers 1

    .line 59
    new-array p0, p0, [Lcom/airbnb/epoxy/ViewHolderState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 56
    invoke-static {p1}, Lcom/airbnb/epoxy/ViewHolderState$3;->read(Landroid/os/Parcel;)Lcom/airbnb/epoxy/ViewHolderState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 56
    invoke-static {p1}, Lcom/airbnb/epoxy/ViewHolderState$3;->read(I)[Lcom/airbnb/epoxy/ViewHolderState;

    move-result-object p0

    return-object p0
.end method

###### Class com.airbnb.epoxy.ViewHolderState.ViewState (com.airbnb.epoxy.ViewHolderState$ViewState)
.class public Lcom/airbnb/epoxy/ViewHolderState$ViewState;
.super Landroid/util/SparseArray;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/ViewHolderState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/SparseArray<",
        "Landroid/os/Parcelable;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/airbnb/epoxy/ViewHolderState$ViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 186
    new-instance v0, Lcom/airbnb/epoxy/ViewHolderState$ViewState$1;

    invoke-direct {v0}, Lcom/airbnb/epoxy/ViewHolderState$ViewState$1;-><init>()V

    sput-object v0, Lcom/airbnb/epoxy/ViewHolderState$ViewState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 129
    invoke-direct {p0}, Landroid/util/SparseArray;-><init>()V

    return-void
.end method

.method private constructor <init>(I[I[Landroid/os/Parcelable;)V
    .registers 7

    .line 133
    invoke-direct {p0, p1}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v0, 0x0

    :goto_4
    if-ge v0, p1, :cond_10

    .line 135
    aget v1, p2, v0

    aget-object v2, p3, v0

    invoke-virtual {p0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_10
    return-void
.end method

.method synthetic constructor <init>(I[I[Landroid/os/Parcelable;B)V
    .registers 5

    .line 127
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/epoxy/ViewHolderState$ViewState;-><init>(I[I[Landroid/os/Parcelable;)V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/view/View;)V
    .registers 3

    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_c

    .line 163
    sget v0, Lo/setMaxInputSize$read;->view_model_state_saving_id:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setId(I)V

    :cond_c
    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read(Landroid/view/View;)V
    .registers 3

    .line 140
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 141
    invoke-static {p1}, Lcom/airbnb/epoxy/ViewHolderState$ViewState;->RemoteActionCompatParcelizer(Landroid/view/View;)V

    .line 143
    invoke-virtual {p1, p0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 144
    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 8

    .line 174
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    move-result v0

    .line 175
    new-array v1, v0, [I

    .line 176
    new-array v2, v0, [Landroid/os/Parcelable;

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v0, :cond_1c

    .line 178
    invoke-virtual {p0, v3}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    aput v4, v1, v3

    .line 179
    invoke-virtual {p0, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Parcelable;

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    .line 181
    :cond_1c
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 182
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 183
    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeParcelableArray([Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class com.airbnb.epoxy.ViewHolderState.ViewState.AnonymousClass1 (com.airbnb.epoxy.ViewHolderState$ViewState$1)
.class final Lcom/airbnb/epoxy/ViewHolderState$ViewState$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/epoxy/ViewHolderState$ViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Lcom/airbnb/epoxy/ViewHolderState$ViewState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lcom/airbnb/epoxy/ViewHolderState$ViewState;
    .registers 5

    .line 190
    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 191
    new-array v1, v0, [I

    .line 192
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 193
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->readParcelableArray(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;

    move-result-object p0

    .line 194
    new-instance p1, Lcom/airbnb/epoxy/ViewHolderState$ViewState;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p0, v2}, Lcom/airbnb/epoxy/ViewHolderState$ViewState;-><init>(I[I[Landroid/os/Parcelable;B)V

    return-object p1
.end method

.method private static read(Landroid/os/Parcel;)Lcom/airbnb/epoxy/ViewHolderState$ViewState;
    .registers 2

    const/4 v0, 0x0

    .line 199
    invoke-static {p0, v0}, Lcom/airbnb/epoxy/ViewHolderState$ViewState$1;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lcom/airbnb/epoxy/ViewHolderState$ViewState;

    move-result-object p0

    return-object p0
.end method

.method private static read(I)[Lcom/airbnb/epoxy/ViewHolderState$ViewState;
    .registers 1

    .line 204
    new-array p0, p0, [Lcom/airbnb/epoxy/ViewHolderState$ViewState;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 187
    invoke-static {p1}, Lcom/airbnb/epoxy/ViewHolderState$ViewState$1;->read(Landroid/os/Parcel;)Lcom/airbnb/epoxy/ViewHolderState$ViewState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 187
    invoke-static {p1, p2}, Lcom/airbnb/epoxy/ViewHolderState$ViewState$1;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lcom/airbnb/epoxy/ViewHolderState$ViewState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 187
    invoke-static {p1}, Lcom/airbnb/epoxy/ViewHolderState$ViewState$1;->read(I)[Lcom/airbnb/epoxy/ViewHolderState$ViewState;

    move-result-object p0

    return-object p0
.end method
