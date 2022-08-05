import pandas as pd

def get_uniques_emails(exel_file):
    """Return a list of unique emails from an exel file pased as a parameter"""
    try:
        df = pd.read_excel(exel_file)
        return df['email'].unique()
    except Exception as e:
        print('Error:', e)


if __name__ == '__main__':
    import sys

    exel_file = 'users.xls'
    
    if len(sys.argv) > 1:
        exel_file = sys.argv[1]

    print(get_uniques_emails(exel_file))