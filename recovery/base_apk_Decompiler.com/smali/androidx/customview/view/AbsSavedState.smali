###### Class androidx.customview.view.AbsSavedState (androidx.customview.view.AbsSavedState)
.class public abstract Landroidx/customview/view/AbsSavedState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/customview/view/AbsSavedState;",
            ">;"
        }
    .end annotation
.end field

.field public static final write:Landroidx/customview/view/AbsSavedState;


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 32
    new-instance v0, Landroidx/customview/view/AbsSavedState$1;

    invoke-direct {v0}, Landroidx/customview/view/AbsSavedState$1;-><init>()V

    sput-object v0, Landroidx/customview/view/AbsSavedState;->write:Landroidx/customview/view/AbsSavedState;

    .line 90
    new-instance v0, Landroidx/customview/view/AbsSavedState$4;

    invoke-direct {v0}, Landroidx/customview/view/AbsSavedState$4;-><init>()V

    sput-object v0, Landroidx/customview/view/AbsSavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Landroidx/customview/view/AbsSavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .registers 2

    .line 31
    invoke-direct {p0}, Landroidx/customview/view/AbsSavedState;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
    .registers 3

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_b

    .line 72
    sget-object p1, Landroidx/customview/view/AbsSavedState;->write:Landroidx/customview/view/AbsSavedState;

    :cond_b
    iput-object p1, p0, Landroidx/customview/view/AbsSavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .registers 3

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_d

    .line 52
    sget-object v0, Landroidx/customview/view/AbsSavedState;->write:Landroidx/customview/view/AbsSavedState;

    if-ne p1, v0, :cond_a

    const/4 p1, 0x0

    :cond_a
    iput-object p1, p0, Landroidx/customview/view/AbsSavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    return-void

    .line 50
    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "superState must not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()Landroid/os/Parcelable;
    .registers 1

    .line 77
    iget-object p0, p0, Landroidx/customview/view/AbsSavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 87
    iget-object p0, p0, Landroidx/customview/view/AbsSavedState;->AudioAttributesCompatParcelizer:Landroid/os/Parcelable;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class androidx.customview.view.AbsSavedState.AnonymousClass1 (androidx.customview.view.AbsSavedState$1)
.class Landroidx/customview/view/AbsSavedState$1;
.super Landroidx/customview/view/AbsSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/customview/view/AbsSavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, v0}, Landroidx/customview/view/AbsSavedState;-><init>(B)V

    return-void
.end method

###### Class androidx.customview.view.AbsSavedState.AnonymousClass4 (androidx.customview.view.AbsSavedState$4)
.class final Landroidx/customview/view/AbsSavedState$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/customview/view/AbsSavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/customview/view/AbsSavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/customview/view/AbsSavedState;
    .registers 2

    .line 93
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p0

    if-nez p0, :cond_9

    .line 97
    sget-object p0, Landroidx/customview/view/AbsSavedState;->write:Landroidx/customview/view/AbsSavedState;

    return-object p0

    .line 95
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "superState must be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static RemoteActionCompatParcelizer(I)[Landroidx/customview/view/AbsSavedState;
    .registers 1

    .line 107
    new-array p0, p0, [Landroidx/customview/view/AbsSavedState;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Landroidx/customview/view/AbsSavedState;
    .registers 2

    const/4 v0, 0x0

    .line 102
    invoke-static {p0, v0}, Landroidx/customview/view/AbsSavedState$4;->RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/customview/view/AbsSavedState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 90
    invoke-static {p1}, Landroidx/customview/view/AbsSavedState$4;->write(Landroid/os/Parcel;)Landroidx/customview/view/AbsSavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .registers 3

    .line 90
    invoke-static {p1, p2}, Landroidx/customview/view/AbsSavedState$4;->RemoteActionCompatParcelizer(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/customview/view/AbsSavedState;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 90
    invoke-static {p1}, Landroidx/customview/view/AbsSavedState$4;->RemoteActionCompatParcelizer(I)[Landroidx/customview/view/AbsSavedState;

    move-result-object p0

    return-object p0
.end method
